import { Component, OnInit } from '@angular/core';
import { JobService } from 'app/job.service';


@Component({
  selector: 'app-typography',
  templateUrl: './typography.component.html',
  styleUrls: ['./typography.component.css']
})
export class TypographyComponent implements OnInit {

  info = {
    title:'', 
    location:'', 
    description:''
  }

  constructor(private service:JobService) { }

  ngOnInit() {
  }

  public addOneJob(){
    let response = this.service.addOneJob(this.info); 
    response.subscribe((data)=>console.log(data))
  }

}
