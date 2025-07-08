#!/bin/bash

# Clean previous builds
echo "Cleaning previous builds..."
mvn clean

# Build the application with production profile
echo "Building WAR file with production profile..."
mvn clean package -Pprod -DskipTests

# Check if build was successful
if [ $? -eq 0 ]; then
    echo "\nBuild successful!"
    echo "WAR file location: target/housing-data-viewer.war"
    echo "\nTo deploy to AWS Elastic Beanstalk:"
    echo "1. Go to AWS Management Console"
    echo "2. Navigate to Elastic Beanstalk"
    echo "3. Create a new application or select an existing one"
    echo "4. Upload the WAR file: target/housing-data-viewer.war"
    echo "\nMake sure to configure your RDS database settings in application-prod.properties"
else
    echo "\nBuild failed. Please check the errors above."
    exit 1
fi
