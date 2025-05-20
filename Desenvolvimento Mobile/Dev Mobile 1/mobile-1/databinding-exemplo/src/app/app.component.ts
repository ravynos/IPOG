import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Exemplo data binding';
  message: string = 'Hello, Angular'
  inputValue: string = ''

  updateMessage() {
    console.log('Clicou')
    this.message = 'Você clicou no botão';
    this.inputValue = this.message
  }
}
