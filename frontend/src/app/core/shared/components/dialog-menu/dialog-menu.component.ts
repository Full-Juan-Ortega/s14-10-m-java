import { Component, EventEmitter, Output, ViewEncapsulation } from '@angular/core';
import { DialogMenuService } from '../../services/dialog-menu.service';
import { LoginService } from 'src/app/modules/auth/services/login.service';
import { AssistentService } from '../../services/assistent.service';

@Component({
  selector: 'app-dialog-menu',
  templateUrl: './dialog-menu.component.html',
  styleUrls: ['./dialog-menu.component.scss'],
  encapsulation: ViewEncapsulation.None
})
export class DialogMenuComponent {

  isOpen: boolean = false;
  isLogged: boolean = false;
  data: any;

  @Output() closeModal = new EventEmitter<void>();

  constructor(
    private dialogMenuService: DialogMenuService,
    private loginService: LoginService,
    private assistentService: AssistentService ){}

  ngOnInit(): void {
    this.assistentService.getAssistant().subscribe(data =>
      this.data = data
    );
  }

  onCloseModal() {
    this.closeModal.emit();
  }

  close() {
    this.dialogMenuService.close()
  }

  logout() {
    this.close();
    this.loginService.logout();
  }

}
