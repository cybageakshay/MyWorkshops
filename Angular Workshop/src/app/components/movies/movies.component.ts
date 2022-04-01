import { Component, OnInit } from '@angular/core';
import { NgForOf } from '@angular/common';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss']
})
export class MoviesComponent implements OnInit {
  movieList=["Basic Instinct","Intersterllar","Inception","Django Unchained"];
  constructor() { }

  ngOnInit(): void {
  }

}
