import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaGeneralComponent } from './lista-general.component';

describe('ListaGeneralComponent', () => {
  let component: ListaGeneralComponent;
  let fixture: ComponentFixture<ListaGeneralComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListaGeneralComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListaGeneralComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
