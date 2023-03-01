import { Component } from '@angular/core';

@Component({
  selector: 'app-test', //tag
  templateUrl: './test.component.html', //html
  styleUrls: ['./test.component.css'] //css
})
export class TestComponent {

  //interpolation - bind  data of class to template

  public name = "code";

  greetUser(){
    return this.name + "welcome";
  }

  public successClass = "text-success";

  onClick(){
    console.log("hi button is clicked");
  }

  public display = false;
}
