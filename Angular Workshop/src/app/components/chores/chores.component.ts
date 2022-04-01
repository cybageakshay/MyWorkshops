import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chores',
  templateUrl: './chores.component.html',
  styleUrls: ['./chores.component.scss']
})
export class ChoresComponent implements OnInit {
  choresList=["Empty Dishwater","Buy Groceries","Launch Code","Do Party"];
  constructor() { }

  ngOnInit(): void {
  }

}
