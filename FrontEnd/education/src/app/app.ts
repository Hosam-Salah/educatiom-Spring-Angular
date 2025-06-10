import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Header} from './components/header/header';
import {Footer} from './components/footer/footer';
import {Profile} from './components/profile/profile';
import {Exam} from './components/exam/exam';
import {Courses} from './components/courses/courses';
import {MyCourses} from './components/my-courses/my-courses';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Header, Footer, Profile, Exam, Courses, MyCourses],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'education';
}
