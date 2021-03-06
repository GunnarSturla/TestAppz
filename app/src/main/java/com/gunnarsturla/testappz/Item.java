package com.gunnarsturla.testappz;

import java.util.Vector;

/**
 * @author Gunnar Sturla Ágústuson
 * @since 9.10.14
 * Klasinn sem heldur utan um alla réttina á matseðlinum og alla eiginleika þeirra
 */

public class Item {
	private int id,					// id á vörunni
				price,				// Verð vörunnar
				calories;			// Calories, ef = 0, þá ekki matur
	private String	name,			// nafn
					description,	// Textalýsing
					ingredients,	// innihaldsefni
					imghash,		// Einstakt hash fyrir þessar myndir,
					comment;
	// sem breytist ef myndirnar eru uppfærðar
	private Vector<String> allergens;  // Vector sem heldur utan um ofnæmisvalda
	private Vector<String> filterable; // Vector sem heldur utan um síanlega hluti, eins og vegetarian, ofl.

	public Item(int id, int price, int cals, String name, String description, String ingredients, String imghash)
	{
		this.id 		= id;			// id á vörunni
		this.price 		= price;		// Verð vörunnar
		this.calories 	= cals;			// Calories, ef = 0, þá ekki matur
		this.name 		= name;			// nafn
		this.description= description;	// Textalýsing
		this.ingredients= ingredients;	// innihaldsefni
		this.imghash	= imghash;		// Einstakt hash fyrir þessar myndir,
										// sem breytist ef myndirnar eru uppfærðar
		this.comment="";
		allergens =  new Vector<String>();
		filterable = new Vector<String>();
	}
    public Item(int id){
        this.id = id;
    }
    public void setId(int id) 					{ this.id = id; }
    public void setPrice(int price) 			{ this.price = price; 	}
    public void setCalories(int cal)			{ this.calories = cal; 	}
    public void setName(String name)			{ this.name = name; 		}
    public void setDescription(String desc)		{ this.description = desc; }
    public void setIngredients(String ingr)		{ this.ingredients = ingr; }
    public void setImghash(String imghash)		{ this.imghash = imghash;   }
	// afritar basically annað item.
	// gagnlegt þegar kúnni setur nýjan rétt í
	// orderqueue
	public Item(Item i) {
		this.id 		= i.getId();	// id á vörunni
		this.price 		= i.getPrice();		// Verð vörunnar
		this.calories 	= i.getCalories();			// Calories, ef = 0, þá ekki matur
		this.name 		= i.getName();			// nafn
		this.description= i.getDescription();	// Textalýsing
		this.ingredients= i.getIngredients();	// innihaldsefni
		this.imghash	= i.getImghash();		// Einstakt hash fyrir þessar myndir,
		// sem breytist ef myndirnar eru uppfærðar
		allergens =  new Vector<String>();
		filterable = new Vector<String>();
	}

	// Bætir ofnæmisvaldi við, skilar true ef það tókst
	public boolean addAllergen(String s) {
		return allergens.add(s);
	}

	// Bætir filterable við, skilar true ef það tókst
	public boolean addFilterable(String f) {
		return filterable.add(f);
	}

	// Aðgerðir til að ná í upplýsingar úr þessum hlut.
	// Notkun, fyrir og eftir er frekar fyrirsjáanlegt.
	public int 	  getId() 			{ return id; 		}
	public int 	  getPrice() 		{ return price; 	}
	public int 	  getCalories()		{ return calories; 	}
	public String getName()			{ return name; 		}
	public String getDescription()	{ return description; }
	public String getIngredients()	{ return ingredients; }
	public String getImghash()		{ return imghash;   }


	public boolean hasAllergens() 	{ return !allergens.isEmpty(); }
	public boolean hasAllergen(String hasIt)
	{
		// Hér þarf að skrifa fall sem fer í gegnum
		// vectorinn og leitar að hasIt
		return false;
	}
	public Object[] getAllergens()	{ return allergens.toArray(); }

	public boolean hasFilterable()	{ return !filterable.isEmpty(); }
	public boolean hasFilterable(String hasIt)
	{
		// Hér þarf að skrifa fall sem fer í gegnum
		// vectorinn og leitar að hasIt
		return false;
	}
	public Object[] getFilterable() { return filterable.toArray(); }
}
