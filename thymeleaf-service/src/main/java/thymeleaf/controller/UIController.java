package thymeleaf.controller;

import thymeleaf.service.UIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

  private UIService UIService;

  @GetMapping("/main")
  public String getSettings(Model model) {
    return "main";
  }

  @GetMapping("/playlists")
  public String getModulesManagementPage(Model model) {
    return "playlists";
  }

  @GetMapping("/about")
  public String getAboutPage(Model model) {
    return "about";
  }
}
