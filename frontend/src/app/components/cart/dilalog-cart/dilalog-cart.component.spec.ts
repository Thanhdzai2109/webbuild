import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DilalogCartComponent } from './dilalog-cart.component';

describe('DilalogCartComponent', () => {
  let component: DilalogCartComponent;
  let fixture: ComponentFixture<DilalogCartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DilalogCartComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DilalogCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
