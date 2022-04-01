import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-random-images',
  templateUrl: './random-images.component.html',
  styleUrls: ['./random-images.component.scss']
})
export class RandomImagesComponent implements OnInit {
  src=["../../../assets/images/sss.jfif","../../../assets/images/sss.jfif","../../../assets/images/sss.jfif"];
  constructor() { }

  ngOnInit(): void {
  }

}
