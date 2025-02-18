import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponenteDetailComponent } from './componente-detail.component';

describe('ComponenteDetailComponent', () => {
  let component: ComponenteDetailComponent;
  let fixture: ComponentFixture<ComponenteDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ComponenteDetailComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComponenteDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
