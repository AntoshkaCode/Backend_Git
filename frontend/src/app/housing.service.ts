import { Injectable, inject } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, catchError, throwError } from 'rxjs';

export interface Housing {
  id: number;
  type: string;
  address: string;
  price: number;
  bedrooms: number;
  bathrooms: number;
  squareFeet: number;
}

@Injectable({
  providedIn: 'root'
})
export class HousingService {
  private readonly apiUrl = 'http://localhost:8082/api/housing';
  private readonly http = inject(HttpClient);

  getHousingData(): Observable<Housing[]> {
    return this.http.get<Housing[]>(this.apiUrl).pipe(
      catchError(this.handleError<Housing[]>('getHousingData', []))
    );
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: HttpErrorResponse): Observable<T> => {
      console.error(`HousingService: ${operation} failed:`, error);
      
      // Return an observable with a user-facing error message
      return throwError(() => new Error(
        `Error: ${error.status} - ${error.statusText || 'Server error'}`
      ));
    };
  }
}
