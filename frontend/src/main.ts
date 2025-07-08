import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { enableProdMode, isDevMode } from '@angular/core';

// Enable production mode unless running locally
if (isDevMode()) {
  console.log('Running in development mode');
} else {
  enableProdMode();
  console.log('Running in production mode');
}

bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error('Bootstrap error:', err));
