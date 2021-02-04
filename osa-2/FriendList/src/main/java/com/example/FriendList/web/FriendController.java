package com.example.FriendList.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.FriendList.domain.Friend;

@Controller
public class FriendController {
	List<Friend> friends = new ArrayList<>();

	@PostMapping("/index")
	public String addFriendSubmit(@ModelAttribute Friend friend, Model model) {
		friends.add(friend);

		model.addAttribute("friends", friends);
		return "index";
	}

}
