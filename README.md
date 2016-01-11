# poem-viz
Intent: To create a visual representation of poems.

Process:
	APIs used: Merriam-Webster Dictionary and Rhymebrain.
	The visual represention will have indicators/graphs/other visual devices in order to show various poetic devices such as rhyme scheme, meter, number of syllables in words, etc.
	User will paste text of poem into the website, and the website will then display the image visualization. 

How we're gonna do it:
	User submits text into HTML form.
	Java http get request gets the form info
	Parse text word by word and run through dictionary API
		Logic to Determine Stress:
		If apostrophe is first character, then the first syllable is stressed.
		Loop through word, every time a hyphen is found, add to syllable integer.  
		Array of negative ones.
		//magic happens
		Get syllable stresses in an array of 1s and -1s.
	Magically switch to javascript.
	Make lines/curves. It looks pretty.
		One curve for each line, stacked curves.
	Rhyme: TBD visuals.	
