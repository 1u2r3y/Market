package com.company;

public class Story {

	private Market start_story;

	public Story(){
		start_story = new Market("Вы пришли в магазин.", "Выберите отдел, который Вы хотите посетить"
		+ "(1) Молочный отдел\n"
		+ "(2) Мясной отдел\n"
		+ "(3) Овощной и Фруктовый отдел\n",
				3);
	}
	start_story.department[0] = new Market()
}
