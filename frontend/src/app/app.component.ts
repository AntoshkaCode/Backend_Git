import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';
import { HousingListComponent } from './housing-list/housing-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, RouterLink, HousingListComponent],
  template: `
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-4">
      <div class="container">
        <a class="navbar-brand" href="#">Housing Data</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" routerLink="/">Home</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    
    <main class="container">
      <app-housing-list></app-housing-list>
    </main>
  `,
  styles: [`
    :host {
      display: block;
      min-height: 100vh;
      background-color: #f8f9fa;
    }
    main {
      padding-bottom: 2rem;
    }
  `]
})
export class AppComponent {
  title = 'Housing Data Viewer';
}
