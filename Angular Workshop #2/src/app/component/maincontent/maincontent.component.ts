import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-maincontent',
  templateUrl: './maincontent.component.html',
  styleUrls: ['./maincontent.component.css']
})
export class MaincontentComponent implements OnInit {
  yesterday=["Dancing","jogging"];
  today=["Watching movies","Bike Ride","Date","Disappointment"];
  tomarrow=["Clubbing","Being alone","trip"];
  movies=["Inception","ShawShank Redemption","God Father","The Dictator"];
  // Movies=[{
  //   id:1,
  //   name:"Inception"
  // },
  // {
  //   id:1,
  //   name:"Inception"
  // }]
  watchList:Array<string>=[];
  addToWatchList(items:string){
          let temp=this.movies.indexOf(items);
          this.movies.splice(temp,1);
          this.watchList.push(items);

  }
  constructor() { }

  ngOnInit(): void {
  }

}
