import { HttpClient, HttpEvent } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class JobService {

  constructor(private http:HttpClient) { }

  public getAllJobs(){
    return this.http.get("http://localhost:8080/jobs/all")
  }

//   public sendFile(fileObj : File){
//     let headers = new Headers();
//     let options = new RequestOptions({ headers: headers }); 

//     let formData = new FormData();
//     formData.append('file', fileObj);

//     return this.http.post('http://localhost:8080/jobs/upload', formData, options).map(res => res.json().data).subscribe();
// }

  public upload(formData: FormData): Observable<HttpEvent<string[]>> {
    return this.http.post<string[]>("http://localhost:8080/file/upload", formData, {
      reportProgress: true,
      observe: 'events'
    });
  }

  public download(filename: string): Observable<HttpEvent<Blob>> {
    return this.http.get("http://localhost:8080/file/download/${filename}/", {
      reportProgress: true,
      observe: 'events',
      responseType: 'blob'
    });
  }

  public addOneJob(job:any){
    return this.http.post("http://localhost:8080/jobs/add", job, {responseType: "Text" as "json"})
  }

  public deleteOneJob(id:any){
    return this.http.delete("http://localhost:8080/jobs/" + id)
  }

  public getAllReferrals(){
    return this.http.get("http://localhost:8080/referrals")
  }

  public deleteOneReferral(id:any){
    return this.http.delete("http://localhost:8080/referrals/" +id)
  }

  public addOneReferral(referral:any){
    return this.http.post("http://localhost:8080/referrals/add", referral, {responseType: "Text" as "json"})
  }

  public updateReferral(id:any, referral:any){
    return this.http.put("http://localhost:8080/referrals/update/"+id, referral, {responseType: "Text" as "json"})
  }

}
