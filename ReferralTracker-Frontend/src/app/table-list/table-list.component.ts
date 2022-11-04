import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { JobService } from 'app/job.service';
import { ideahub } from 'googleapis/build/src/apis/ideahub';
import { HttpErrorResponse, HttpEvent, HttpEventType } from '@angular/common/http';
import { saveAs } from 'file-saver';

@Component({
  selector: 'app-table-list',
  templateUrl: './table-list.component.html',
  styleUrls: ['./table-list.component.css']
})
export class TableListComponent implements OnInit {

  referrals:any 
  constructor(private service:JobService, private router:Router) { }

  ngOnInit() {
    let response = this.service.getAllReferrals(); 
    response.subscribe((data)=>this.referrals = data)
  }

  public deleteOneReferral(id:number){
    let response = this.service.deleteOneReferral(id); 
    response.subscribe((data)=> this.referrals = data)
  }
  public updateOneReferral(id:number){
    console.log(id)
    this.router.navigate(["/maps"], {state:{id:id}})
  }

}
