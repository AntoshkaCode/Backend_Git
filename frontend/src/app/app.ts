import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { HousingListComponent } from './housing-list/housing-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule, 
    RouterOutlet,
    HttpClientModule,
    HousingListComponent
  ],
  template: `
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-4">
      <div class="container">
        <a class="navbar-brand" href="#">Housing Data Viewer</a>
      </div>
    </nav>
    <div class="container">
      <app-housing-list></app-housing-list>
    </div>
  `,
  styles: [`
    .navbar {
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }
  `]
})
export class AppComponent {
  title = 'Housing Data Viewer';
}
