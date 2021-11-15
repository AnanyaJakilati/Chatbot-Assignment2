/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "Hello!";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
    else if (findKeyword(statement, "cast") >= 0
    || findKeyword(statement, "crew") >= 0
    || findKeyword(statement, "actors") >= 0
    || findKeyword(statement, "real name") >= 0
    || findKeyword(statement, "plays") >= 0)
		{
      response = "This is the cast & crew: Debby Ryan - Jessie Prescott, Kevin Chamberlain - Bertram Winkle, Skai Jackson - Zuri Ross, Peyton List - Emma Ross, Cameron Boyce - Luke Ross, Karan Brar - Ravi Ross,Rhoda Chesterfield - Carolyn Hennesy, Chris Galya - Tony Chiccolini, Joey Richter - Officer Peetey";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "zuri") >= 0)
		{
			response = "Zuri is from Uganda and loves Chubby the bear.";
		}
    else if (findKeyword(statement, "luke") >= 0)
		{
			response = "Luke thinks that he is from Krypton. He is a good dancer.";
		}
    else if (findKeyword(statement, "ravi") >= 0)
		{
			response = "Ravi is from India. He is a good student.";
		}
    else if (findKeyword(statement, "emma") >= 0)
		{
			response = "Emma is not adopted. Emma is a very nice person.";
		}
    else if (findKeyword(statement, "jessie") >= 0)
		{
			response = "Jessie is from Texas. She is the nanny for the four Ross children.";
		}
    else if (findKeyword(statement, "bertram") >= 0)
		{
			response = "Bertram is the butler and chef. He is lazy but he loves to sing opera. He is very into boy bands!";
		}
    else if (findKeyword(statement, "shut") >= 0 
              || findKeyword(statement, "annoying") >= 0)
		{
			response = "Rude!";
		}
    else if (findKeyword(statement, "hello") >= 0
      || findKeyword(statement, "hi") >= 0
      || findKeyword(statement, "hey") >= 0)
		{
			response = "How are you doing today?";
		}
    else if (findKeyword(statement, "am good") >= 0 
      || findKeyword(statement, "doing good") >= 0
      || findKeyword(statement, "doing bad") >= 0
      || findKeyword(statement, "doing ok") >= 0
      || findKeyword(statement, "doing okay") >= 0
      || findKeyword(statement, "doing alright") >= 0
      || findKeyword(statement, "anyways") >= 0)
		{
			response = "Lets talk about Jessie!";
		}
    else if (findKeyword(statement, "mad") >= 0 
      || findKeyword(statement, "bad") >= 0
      || findKeyword(statement, "sad") >= 0
      || findKeyword(statement, "terrible") >= 0
      || findKeyword(statement, "horrible") >= 0
      || findKeyword(statement, "not good") >= 0)
		{
      response = "Aww, Oh no! Let's talk about Jessie to cheer you up!";
		}
    else if (findKeyword(statement, "favorite character") >= 0 
      || findKeyword(statement, "best dancer") >= 0
      || findKeyword(statement, "dancer") >= 0
      || findKeyword(statement, "funniest character") >= 0
      || findKeyword(statement, "middle child") >= 0
      || findKeyword (statement, "from Krypton") >= 0)
		{
      response = "That's Luke in Jessie!";
		}
       else if (findKeyword(statement, "Millie the Mermaid") >= 0
       || findKeyword(statement, "bad student") >= 0
      || findKeyword(statement, "Chubby the bear") >= 0
      || findKeyword(statement, "Zeebee") >= 0
      || findKeyword(statement, "youngest") >= 0
      || findKeyword(statement, "middle child") >= 0
      || findKeyword(statement, "uganda") >= 0
      || findKeyword(statement, "most imaginative child") >= 0)
		{
      response = "That's Zuri in Jessie!";
		}
        else if (findKeyword(statement, "shoes") >= 0
      || findKeyword(statement, "not adopted") >= 0
      || findKeyword(statement, "oldest") >= 0
      || findKeyword(statement, "beautiful") >= 0
      || findKeyword(statement, "nice") >= 0)
		{
      response = "That's Emma in Jessie!";
		}
      else if (findKeyword(statement, "the smartest") >= 0
      || findKeyword(statement, "smart") >= 0
      || findKeyword(statement, "student") >= 0
      || findKeyword(statement, "good student") >= 0
      || findKeyword(statement, "best student") >= 0
      || findKeyword(statement, "indian") >= 0
      || findKeyword(statement, "india") >= 0
      || findKeyword(statement, "pet named Mrs. Kipling") >= 0     
      || findKeyword(statement, "middle child") >= 0
      || findKeyword(statement, "freckles") >= 0)
		{
      response = "That is Ravi in Jessie!";
		}
    else if (findKeyword(statement, "ok") >= 0
    || findKeyword(statement, "okay") >= 0
    || findKeyword(statement, "alright") >= 0
    || findKeyword(statement, "fine") >= 0
    || findKeyword(statement, "k") >= 0)
		{
      response = "What questions do you have about Jessie?";
		}
    else if (findKeyword(statement, "beautiful") >= 0
    || findKeyword(statement, "Texas") >= 0
    || findKeyword(statement, "Tony") >= 0
    || findKeyword(statement, "teacup") >= 0
    || findKeyword(statement, "Darla") >= 0
    || findKeyword(statement, "dad") >= 0
    || findKeyword(statement, "nanny") >= 0
    || findKeyword(statement, "babysitter") >= 0
    || findKeyword(statement, "child care") >= 0
    || findKeyword(statement, "Brooks") >= 0)
		{
      response = "That would be Jessie!";
		}
    else if (findKeyword(statement, "bald") >= 0
    || findKeyword(statement, "grumpy") >= 0
    || findKeyword(statement, "butler") >= 0
    || findKeyword(statement, "teddy bear") >= 0
    || findKeyword(statement, "lazy") >= 0
    || findKeyword(statement, "laziest") >= 0
    || findKeyword(statement, "chef") >= 0
    || findKeyword(statement, "cook") >= 0
    || findKeyword(statement, "Mrs. Chesterfield") >= 0
    || findKeyword(statement, "miserable") >= 0
    || findKeyword(statement, "opera") >= 0
    || findKeyword(statement, "boy bands") >= 0
    || findKeyword(statement, "'its so far'") >= 0)
		{
      response = "That would be Bertram!";
		}
		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
    else if (findKeyword(statement, "Do you like", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
    else if (findKeyword(statement, "Who is", 0) >= 0)
		{
			response = transformWhoStatement(statement);
		}

		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}

	
	
	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}

  private String transformWhoStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfWho = findKeyword (statement, "Who is", 0);
	//	int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		//String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
    String restOfStat = statement.substring(psnOfWho + 6).trim();
		return "I don't know who is " + restOfStat;
	}
	
	

	
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) 
		{
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0)
			{
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}
	


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "So...";
		}
		else if (whichResponse == 1)
		{
			response = "Cool";
		}
		else if (whichResponse == 2)
		{
			response = "Really?";
		}
		else if (whichResponse == 3)
		{
			response = "Whatever.";
		}

		return response;
	}

}
