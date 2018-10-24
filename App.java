package com.kmit.QuickCook;

public class App 
{
    public static void main( String[] args )
    {
    }
    public static String ingredients(int x)
    {
    	String []ing=new String[]{"APPLE CHIPS: Ingredients\r\n" + 
		"for 1 serving\r\n. " + 
		"\r\n" + 
		"2 apples\r\n. " + 
		"nonstick cooking spray or oil\r\n. " + 
		"1 teaspoon  cinnamon ","KALE CHIPS: Ingredients\r\n" + 
				"for 1 serving\r\n. " + 
				"\r\n" + 
				"1 bunch kale\r\n. " + 
				"2 tablespoons  olive oil\r\n. " + 
				"¼ teaspoon  salt\r\n. " + 
				"¼ teaspoon  pepper\r\n. " + 
				"¼ teaspoon  paprika.","ZUCCHINI CHIPS: Ingredients\r\n" + 
						"for 1 serving\r\n. " + 
						"\r\n" + 
						"1 large zucchini\r\n. " + 
						"2 tablespoons  olive oil\r\n. " + 
						"¼ teaspoon  salt\r\n. " + 
						"½ teaspoon  pepper\r\n. " + 
						"½ teaspoon  garlic powder. ","SWEET POTATO CHIPS: Ingredients\r\n" + 
								"for 1 serving\r\n. " + 
								"\r\n" + 
								"1 large sweet potato or yam\r\n. " + 
								"4 tablespoons  olive oil\r\n. " + 
								"½ teaspoon  salt\r\n. " + 
								"½ teaspoon  pepper\r\n. " + 
								"1 teaspoon  dried thyme. ","PIZZA WAFFLES: Ingredients\r\n" + 
										"for 4 waffles\r\n. " + 
										"\r\n" + 
										"14 oz  pizza dough.  1 tube.  or homemade pizza dough (395 g)\r\n. " + 
										"4 tablespoons  marinara sauce\r\n. " + 
										"1 cup  shredded mozzarella cheese (100 g)\r\n. " + 
										"12 slices pepperoni","CARROT FRIES: Ingredients\r\n" + 
												"for 1 serving\r\n. " + 
												"\r\n" + 
												"2 carrots\r\n. " + 
												"2 tablespoons  olive oil\r\n. " + 
												"1 tablespoon  fresh parsley, chopped\r\n. " + 
												"1 teaspoon  paprika\r\n. " + 
												"1 teaspoon  salt\r\n. " + 
												"1 teaspoon  pepper","RASPBERRY LEMON POPSICLES: Ingredients\r\n" + 
														"for 6 popsicles\r\n. " + 
														"\r\n" + 
														"1 cup  raspberry (125 g)\r\n. " + 
														"1 cup  fresh lemon juice (240 mL)\r\n. " + 
														"1 ½ cups  water (360 mL).SPECIAL EQUIPMENT"
														 + 
														"\"popsicle mold, with 6 slots","PEACH SORBET: Ingredients\r\n" + 
																"for 4 servings\r\n. " + 
																"\r\n" + 
																"1 lb  frozen peach, frozen (450 g)\r\n. " + 
																"¼ cup  honey (85 g). ","FROZEN SMOOTHIE POPS: Ingredients\r\n" + 
																		"for 6 servings\r\n. " + 
																		"\r\n" + 
																		"2 cups  mixed berries.  fresh or frozen (200 g)\r\n. " + 
																		"1 banana\r\n. " + 
																		"¼ cup  yogurt (61 g)\r\n." + 
																		"1 cup  milk (240 mL). SPECIAL EQUIPMENT\r\n" + 
																		"\r\n" + 
																		"6 small paper cups\r\n" + 
																		"6 popsicle sticks","CHEESY CLOUD CHIPS: Ingredients\r\n" + 
																				"for 24 chips\r\n. " + 
																				"\r\n" + 
																				"4 egg whites\r\n. " + 
																				"1 teaspoon  garlic powder\r\n. " + 
																				"2 teaspoons  parsley\r\n. " + 
																				"salt. to taste\r\n. " + 
																				"pepper. to taste\r\n. " + 
																				"½ cup  shredded cheese blend (50 g)","MOZZARELLA PASTA: Ingredients\r\n" + 
																						"for 1 serving\r\n. " + 
																						"\r\n" + 
																						"1 cup  shredded mozzarella cheese (100 g)\r\n. " + 
																						"1 egg yolk","PESTO PARMESAN CHIPS: Ingredients\r\n" + 
																								"for 32 chips\r\n. " + 
																								"\r\n" + 
																								"2 cups  shredded parmesan cheese (200 g)\r\n. " + 
																								"¼ cup  pesto (55 g)\r\n. " + 
																								"salt, to taste\r\n. " + 
																								"pepper, to taste","CHOCOLATE ALMOND SMOOTHIE: Ingredients\r\n" + 
																										"for 2 servings\r\n. " + 
																										"\r\n" + 
																										"1 ½ cups  coconut milk (350 mL)\r\n. " + 
																										"60 ¼ cup  almond butters\r\n. " + 
																										"1 scoop chocolate protein powder\r\n. " + 
																										"1 cup  ice (140 g)","ORANGE MANGO CARROT SMOOTHIE: Ingredients\r\n" + 
																												"for 2 servings\r\n. " + 
																												"\r\n" + 
																												"¼ cup  orange juice (60 mL)\r\n. " + 
																												"1 orange. peeled. sliced\r\n. " + 
																												"1 mango. peeled. sliced\r\n. " + 
																												"3 large carrots. peeled. shredded\r\n. " + 
																												"1 ½ cups  ice (210 g)","PEANUT BUTTER OAT ENERGY BALLS: Ingredients\r\n" + 
																														"for 6 servings\r\n. " + 
																														"\r\n" + 
																														"½ cup  rolled oats (50 g)\r\n. " + 
																														"⅓ cup  peanut butter (80 g)\r\n. " + 
																														"1 tablespoon  honey\r\n. " + 
																														"1 tablespoon  dark chocolate chip. optional\r\n." + 
																														"salt, to taste"};

    	/*String []ing=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","o"};*/
    	return ing[x];
    }
    public static String recipes(int y)
    {
    	String []rec=new String[]{"Preparation\r\n" + 
    			"Preheat the oven to 350˚F (180˚C). Line a baking sheet with parchment paper.\r\n" + 
    			"Cut the apples into ⅛- to ¼-inch (3-to 6-mm) slices. Arrange on the baking sheet. Spray the slices with nonstick spray or brush with oil. Then, sprinkle with cinnamon.\r\n" + 
    			"Bake for 30 minutes, flipping halfway, until lightly golden brown. Let cool to room temperature.\r\n" + 
    			"Enjoy!","Preparation\r\n" + 
    					"Preheat the oven to 350˚F (180˚C). Line a baking sheet with parchment paper.\r\n" + 
    					"Remove the kale leaves from the thick stems, then chop into bite-size pieces. In a medium bowl, top the kale with the olive oil. Mix the seasonings and add to the kale. Toss until fully coated.\r\n" + 
    					"Arrange seasoned kale on a baking sheet, ensuring the chips don't overlap. Bake for 10-15 minutes, until the edges are brown, but not burnt. Let cool to room temperature.\r\n" + 
    					"Enjoy!","Preparation\r\n" + 
    							"Preheat the oven to 400˚F (200˚C). Line a baking sheet with parchment paper.\r\n" + 
    							"Cut the zucchini into ⅛- to ¼-inch (3- to 6-mm) slices. Arrange on the baking sheet, ensuring the slices aren't overlapping, otherwise they won't dry out properly. Brush the slices with olive oil, then season with salt, pepper, and garlic powder. Flip the slices over and repeat.\r\n" + 
    							"Bake for 25-35 minutes, flipping halfway, until golden brown. Let cool to room temperature. The zucchini will continue to get crispier as they cool.\r\n" + 
    							"Enjoy!","Preparation\r\n" + 
    									"Preheat the oven to 400˚F (200˚C). Line a baking sheet with parchment paper.\r\n" + 
    									"Cut the sweet potato into ⅛-inch to ¼-inch (3- to 6-mm) slices. In a medium bowl, toss the sweet potato slices with olive oil until fully coated. Add the seasonings and toss to coat. Arrange the slices on a baking sheet without overlapping the potatoes.\r\n" + 
    									"Bake for 25 - 35 minutes, flipping halfway, until golden brown. Let the slices cool to room temperature.\r\n" + 
    									"Enjoy!","Preparation\r\n" + 
    											"Under 30 min\r\n" + 
    											"Slice the pizza dough into 8 equal pieces, then press each piece flat.\r\n" + 
    											"Place 4 pieces of dough into a preheated, greased waffle iron.\r\n" + 
    											"Spread one tablespoon of marinara, ¼ cup (25 grams) of mozzarella, and 3 slices of pepperoni on each piece of dough.\r\n" + 
    											"Top with the 4 remaining pieces of dough and seal.\r\n" + 
    											"Cook for 3-5 minutes, until golden brown, then serve.\r\n" + 
    											"Enjoy!","Preparation\r\n" + 
    													"Preheat oven to 425°F (220°C).\r\n" + 
    													"Cut carrots into fries and combine in a large bowl with olive oil, parsley, paprika, salt, and pepper.\r\n" + 
    													"Place on baking sheet lined with parchment paper in a single layer. Bake for 20-25 minutes, flipping halfway.\r\n" + 
    													"Prepare dip while fries are baking. Combine all dip ingredients in a small bowl and set aside in the refrigerator until ready to use.\r\n" + 
    													"Enjoy!","Preparation\r\n" + 
    															"Strain fresh lemon juice.\r\n" + 
    															"Pour ⅙ of lemon juice in each slot of the popsicle mold.\r\n" + 
    															"Fill the mold with raspberries.\r\n" + 
    															"Fill in the gaps of air with water.\r\n" + 
    															"Freeze the popsicles for at least 5 hours.\r\n" + 
    															"Take the frozen popsicles out of the ice molds and enjoy!\r\n" + 
    															"","Preparation\r\n" + 
    																	"Add the peaches and honey to a food processor and combine until evenly mixed.\r\n" + 
    																	"Transfer to a loaf pan and transfer to freezer until completely frozen.\r\n" + 
    																	"Enjoy!","Preparation\r\n" + 
    																			"In a blender mix all ingredients until smooth.\r\n" + 
    																			"Place six small paper cups on a baking tray and fill the cups with the smoothie and freeze for 15 minutes.\r\n" + 
    																			"Place one popsicle stick in the center of each cup and freeze again for one hour or until solid.\r\n" + 
    																			"Rip the paper cups from the popsicle.\r\n" + 
    																			"Enjoy!","Preparation\r\n" + 
    																					"Under 30 min\r\n" + 
    																					"Preheat oven to 400°F (200˚C).\r\n" + 
    																					"In a bowl, whisk together egg whites, garlic powder, parsley, salt, and pepper.\r\n" + 
    																					"Evenly distribute egg mixture in a greased mini muffin tin. The more mixture per muffin slot, the thicker the chip.\r\n" + 
    																					"Top with shredded cheese.\r\n" + 
    																					"Bake for 12-15 minutes, or until until cheese is melted and edges are slightly brown.\r\n" + 
    																					"Cool for 10 minutes.\r\n" + 
    																					"Remove chips using an offset spatula.\r\n" + 
    																					"Enjoy!","Preparation\r\n" + 
    																							"Add the mozzarella to a bowl and microwave for 1-2 minutes, until melted.\r\n" + 
    																							"Allow the mozzarella to cool for 30 seconds.\r\n" + 
    																							"With a spatula, gently fold the egg yolk into the cheese.\r\n" + 
    																							"Turn the mixture out onto a parchment paper-lined baking sheet.\r\n" + 
    																							"Place another piece of parchment paper on top of the dough and press down with your hand until thin.\r\n" + 
    																							"Remove the top piece of parchment and cut the dough into thin strips.\r\n" + 
    																							"Place the “pasta” on a rack and refrigerate for four hours or overnight.\r\n" + 
    																							"Place the “pasta” in boiling water for one minute.\r\n" + 
    																							"Drain into a colander and run cool water over the pasta to prevent sticking.\r\n" + 
    																							"Serve with your favorite sauce and toppings.\r\n" + 
    																							"Enjoy!\r\n" + 
    																							"","Preparation\r\n" + 
    																									"Under 30 min\r\n" + 
    																									"Preheat oven to 350°F (180˚C).\r\n" + 
    																									"In a medium-sized mixing bowl, combine Parmesan cheese, pesto, salt, and pepper.\r\n" + 
    																									"Spoon cheese mixture into a greased mini muffin tin.\r\n" + 
    																									"Bake 5-8 minutes, or until cheese is melted and edges are slightly brown.\r\n" + 
    																									"Cool for 10 minutes.\r\n" + 
    																									"Enjoy!","Preparation\r\n" + 
    																											"Under 30 min\r\n" + 
    																											"Put all ingredients into a blender and mix until smooth.\r\n" + 
    																											"Enjoy!","Preparation\r\n" + 
    																													"Under 30 min\r\n" + 
    																													"Place the orange juice, orange, mango, and carrots in a blender or food processor and blend until just combined.\r\n" + 
    																													"Add in the ice and continue to blend until the mixture is smooth.\r\n" + 
    																													"Serve immediately.\r\n" + 
    																													"Enjoy!","Preparation\r\n" + 
    																															"Combine all ingredients in a small bowl and mix until thoroughly combined.\r\n" + 
    																															"Chill in the refrigerator for 30 minutes.\r\n" + 
    																															"Use a spoon or tablespoon to evenly divide the mixture into 6 balls. Use your hands to form the ball.\r\n" + 
    																															"Enjoy one now and save the rest for later by storing them in a sealed container in the refrigerator up to 1 week.\r\n" + 
    																															"Enjoy!"};
    	
    	/*String []rec=new String[]{"ok a"," ok b","ok c"," ok d","ok e","ok f"," ok g","ok h","ok i","ok j","ok k","ok l","ok m","ok o"};*/
    	return rec[y];
    }
}
