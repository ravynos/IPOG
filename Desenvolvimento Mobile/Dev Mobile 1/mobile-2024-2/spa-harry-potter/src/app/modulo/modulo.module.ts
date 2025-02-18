import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ModuloRoutingModule } from './modulo-routing.module';
import { ComponenteDetailComponent } from './componente-detail/componente-detail.component';
import { ComponenteListComponent } from './componente-list/componente-list.component';


@NgModule({
  declarations: [
    ComponenteDetailComponent,
    ComponenteListComponent
  ],
  imports: [
    CommonModule,
    ModuloRoutingModule
  ]
})
export class ModuloModule { }
