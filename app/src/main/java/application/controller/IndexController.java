package application.controller;
//Esta linha especifica que a classe IndexController está no pacote application.controller.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//Essas linhas importam classes do Spring Framework. @Controller é uma anotação que indica que a 
//classe é um controlador, enquanto @RequestMapping é uma anotação usada para mapear solicitações HTTP a métodos específicos.

@Controller
public class IndexController {
//Aqui, a classe IndexController é definida como um controlador Spring.

    @RequestMapping("/")
    public String home() {
        return "home";
    }
    //Este é o método home(). A anotação @RequestMapping("/") indica que este método responderá a solicitações feitas para a raiz do contexto da aplicação ("/"). 
    //O método retorna uma string "home". Em um contexto Spring MVC, isso geralmente significa que o controlador está configurado para retornar a página chamada "home".
}

