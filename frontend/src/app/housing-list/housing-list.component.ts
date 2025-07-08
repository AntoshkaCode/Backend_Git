import { Component, OnInit, inject } from '@angular/core';
import { CommonModule, DecimalPipe } from '@angular/common';
import { HousingService, Housing } from '../housing.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-housing-list',
  standalone: true,
  imports: [CommonModule, DecimalPipe, FormsModule, HttpClientModule],
  templateUrl: './housing-list.component.html',
  styleUrls: ['./housing-list.component.css']
})
export class HousingListComponent implements OnInit {
  housingData: Housing[] = [];
  loading = true;
  error: string | null = null;
  private housingService = inject(HousingService);

  ngOnInit(): void {
    this.loadHousingData();
  }

  private loadHousingData(): void {
    this.housingService.getHousingData().subscribe({
      next: (data: Housing[]) => {
        this.housingData = data;
        this.loading = false;
      },
      error: (err) => {
        this.error = 'Failed to load housing data. Please try again later.';
        this.loading = false;
        console.error('Error fetching housing data:', err);
      }
    });
  }
}
