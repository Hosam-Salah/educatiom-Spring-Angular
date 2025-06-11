import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProfileComponent } from './componats/profile/profile.component';
import { CoursesComponent } from './componats/courses/courses.component';
import { MyCoursesComponent } from './componats/my-courses/my-courses.component';
import { ExamComponent } from './componats/exam/exam.component';
import { HeaderComponent } from './componats/header/header.component';
import { FooterComponent } from './componats/footer/footer.component';
import {RouterModule, Routes} from '@angular/router';

const routs: Routes = [
  {path: 'profile', component: ProfileComponent},
  {path: 'courses', component: CoursesComponent},
  {path: 'my-courses', component: MyCoursesComponent},
  {path: 'exam', component: ExamComponent},
  {path: '', component: CoursesComponent},
  {path: '**' , component: CoursesComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    CoursesComponent,
    MyCoursesComponent,
    ExamComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routs)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
