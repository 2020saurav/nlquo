package com.example.saurav;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Quotes extends Activity {
	
	private String []th = new String[133];
	{
	th[0]="Just know, when you truly want success, you\'ll never give up on it. No matter how bad the situation may get.";
    th[1]="Accept responsibility for your life. Know that it is you who will get you where you want to go, no one else.";
    th[2]="I don\'t regret the things I\'ve done, I regret the things I didn\'t do when I had the chance.";
    th[3]="Challenges are what make life interesting and overcoming them is what makes life meaningful.";
    th[4]="Its hard to wait around for something you know might never happen, but its harder to give up when you know its everything you want.";
    
    th[5]="One of the most important keys to Success is having the discipline to do what you know you should do, even when you dont feel like doing it.";
    th[6]="Good things come to those who wait.. greater things come to those who get off their ass and do anything to make it happen.";
    th[7]="Happiness cannot be traveled to, owned, earned, or worn. It is the spiritual experience of living every minute with love, grace & gratitude.";
    th[8]="In order to succeed, your desire for success should be greater than your fear of failure.";

    th[9]="Go where you are celebrated - not tolerated. If they can\'t see the real value of you, it\'s time for a new start.";
    th[10]="Dont be afraid to stand for what you believe in, even if that means standing alone.";

    th[11]="The best revenge is massive success.";
    th[12]= "Forget all the reasons it won\'t work and believe the one reason that it will";
    th[13]="The only way to do great work is to love what you do. If you haven\'t found it yet, keep looking. Don\'t settle.";
    th[14]="Life is short, live it. Love is rare, grab it. Anger is bad, dump it. Fear is awful, face it. Memories are sweet, cherish it.";
    th[15]="When you say \"It\'s hard\", it actually means \"I\'m not strong enough to fight for it\". Stop saying its hard. Think positive!";
    th[16]="Life is like photography. You need the negatives to develop.";
    th[17]="Don\'t worry about failures, worry about the chances you miss when you don\'t even try.";
    
    th[18]="The pain you feel today is the strength you feel tomorrow. For every challenge encountered there is opportunity for growth.";
    th[19]="Build your own dreams, or someone else will hire you to build theirs.";
    th[20]="The only thing that stands between you and your dream is the will to try and the belief that it is actually possible.";
    th[21]="Self confidence is the most attractive quality a person can have. How can anyone see how awesome you are if you can\'t see it yourself?";
    
    th[22]="We learn something from everyone who passes through our lives.. Some lessons are painful, some are painless.. but, all are priceless.";
    th[23]="Being happy doesn\'t mean that everything is perfect. it means that you\'ve decided to look beyond the imperfections";
    th[24]="Nobody ever wrote down a plan to be broke, fat, lazy, or stupid. Those things are what happen when you don\'t have a plan";

    th[25]="Three things you cannot recover in life: the WORD after it\'s said, the MOMENT after it\'s missed and the TIME after it\'s gone. Be Careful!";
    th[26]="Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending.";
    th[27]="Walk away from anything or anyone who takes away from your joy. Life is too short to put up with fools.";
    th[28]="Love what you have. Need what you want. Accept what you receive. Give what you can. Always remember, what goes around, comes around...";
    th[29]="Just remember there is someone out there that is more than happy with less than what you have.";
    th[30]="The biggest failure you can have in life is making the mistake of never trying at all.";
    th[31]="No one is going to hand me success. I must go out and get it myself. That\'s why I\'m here. To dominate. To conquer. Both the world, and myself";
    th[32]="Whatever the mind of man can conceive and believe, it can achieve. -Napoleon Hill";
    
    th[33]="Strive not to be a success, but rather to be of value. -Albert Einstein";
    th[34]="Two roads diverged in a wood, and I took the one less traveled by, And that has made all the difference.  -Robert Frost";
    th[35]="I attribute my success to this: I never gave or took any excuse. -Florence Nightingale";
    th[36]="You miss 100% of the shots you don\'t take. -Wayne Gretzky";
    th[37]=th[25];
    th[38]="The most difficult thing is the decision to act, the rest is merely tenacity. -Amelia Earhart";
    th[39]="Every strike brings me closer to the next home run. -Babe Ruth";
    th[40]="Definiteness of purpose is the starting point of all achievement. -W. Clement Stone";
    th[41]="The past is a ghost, the future a dream. All we ever have is now. -Bill Cosby";
    th[42]="Life is what happens to you while you\'re busy making other plans. -John Lennon";
    th[43]="We become what we think about. -Earl Nightingale";
    
    th[44]=th[22];
    th[45]="Life is 10% what happens to me and 90% of how I react to it. -Charles Swindoll";
    th[46]="The most common way people give up their power is by thinking they don\'t have any. -Alice Walker";
    th[47]="The mind is everything. What you think you become.  -Buddha";
    th[48]="The best time to plant a tree was 20 years ago. The second best time is now. -Chinese Proverb";
    th[49]="An unexamined life is not worth living. -Socrates";
    th[50]="Eighty percent of success is showing up. -Woody Allen";
    th[51]="Your time is limited, so don\'t waste it living someone else\'s life. -Steve Jobs";
    th[52]="Winning isn\'t everything, but wanting to win is. -Vince Lombardi";
    th[53]="I am not a product of my circumstances. I am a product of my decisions. -Stephen Covey";
    th[54]="Every child is an artist.  The problem is how to remain an artist once he grows up. -Pablo Picasso";
    
    th[55]="You can never cross the ocean until you have the courage to lose sight of the shore. -Christopher Columbus";
    th[56]="I\'ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. -Maya Angelou";
    th[57]="Either you run the day, or the day runs you. -Jim Rohn";
    th[58]="Whether you think you can or you think you can\'t, you\'re right. -Henry Ford";
    
    th[59]="The two most important days in your life are the day you are born and the day you find out why. -Mark Twain";
    th[60]="Whatever you can do, or dream you can, begin it.  Boldness has genius, power and magic in it. -Johann Wolfgang von Goethe";
    th[61]="The best revenge is massive success. -Frank Sinatra";
    th[62]="People often say that motivation doesn\'t last. Well, neither does bathing.  That\'s why we recommend it daily. -Zig Ziglar";
    th[63]="Life shrinks or expands in proportion to one\'s courage. -Anais Nin";
    th[64]="If you hear a voice within you say \'you cannot paint,\' then by all means paint and that voice will be silenced. -Vincent Van Gogh";
    
    th[65]="There is only one way to avoid criticism: do nothing, say nothing, and be nothing. -Aristotle";
    th[66]="Ask and it will be given to you; search, and you will find; knock and the door will be opened for you. -Jesus";
    th[67]="The only person you are destined to become is the person you decide to be. -Ralph Waldo Emerson";
    th[68]="Go confidently in the direction of your dreams.  Live the life you have imagined. -Henry David Thoreau";
    th[69]="When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left and could say, I used everything you gave me. -Erma Bombeck";
    th[70]="Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.  -Booker T. Washington";
    th[71]="Certain things catch your eye, but pursue only those that capture the heart. - Ancient Indian Proverb";
    th[72]="Believe you can and you\'re halfway there. -Theodore Roosevelt";
    th[73]="Everything you\'ve ever wanted is on the other side of fear. -George Addair";
    th[74]="We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light. -Plato";
    th[75]="Teach thy tongue to say, \"I do not know,\" and thous shalt progress. -Maimonides";
    th[76]="Start where you are. Use what you have.  Do what you can. -Arthur Ashe";
    th[77]= th[73];
    th[78]="Fall seven times and stand up eight. -Japanese Proverb";
    th[79]="When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us. -Helen Keller";
    
    th[80]="Everything has beauty, but not everyone can see. -Confucius";
    th[81]="How wonderful it is that nobody need wait a single moment before starting to improve the world. -Anne Frank";
    th[82]="When I let go of what I am, I become what I might be. -Lao Tzu";
    th[83]="Life is not measured by the number of breaths we take, but by the moments that take our breath away. -Maya Angelou";
    th[84]="Happiness is not something readymade.  It comes from your own actions. -Dalai Lama";
    th[85]="If you\'re offered a seat on a rocket ship, don\'t ask what seat! Just get on. -Sheryl Sandberg";
    
    th[86]= th[30];
    th[87]="If the wind will not serve, take to the oars. -Latin Proverb";
    th[88]="You can\'t fall if you don\'t climb.  But there\'s no joy in living your whole life on the ground. -Unknown";
    th[89]="We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained. -Marie Curie";
    th[90]="Too many of us are not living our dreams because we are living our fears. -Les Brown";
    th[91]="Challenges are what make life interesting and overcoming them is what makes life meaningful. -Joshua J. Marine";
    th[92]="If you want to lift yourself up, lift up someone else. -Booker T. Washington";
    
    th[93]="I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do. -Leonardo da Vinci";
    th[94]="Limitations live only in our minds.  But if we use our imaginations, our possibilities become limitless. -Jamie Paolinetti";
    th[95]="You take your life in your own hands, and what happens? A terrible thing, no one to blame. -Erica Jong";
    th[96]="What\'s money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do. -Bob Dylan";
    th[97]="I didn\'t fail the test. I just found 100 ways to do it wrong. -Benjamin Franklin";
    th[98]="In order to succeed, your desire for success should be greater than your fear of failure. -Bill Cosby";
    th[99]="A person who never made a mistake never tried anything new. - Albert Einstein";
    th[100]="The person who says it cannot be done should not interrupt the person who is doing it. -Chinese Proverb";
    
    th[101]="There are no traffic jams along the extra mile. -Roger Staubach";
    th[102]="It is never too late to be what you might have been. -George Eliot";
    th[103]="You become what you believe. -Oprah Winfrey";
    th[104]="I would rather die of passion than of boredom. -Vincent van Gogh";
    th[105]="A truly rich man is one whose children run into his arms when his hands are empty. -Unknown";
    th[106]="It is not what you do for your children, but what you have taught them to do for themselves, that will make them successful human beings.  -Ann Landers";
    th[107]="If you want your children to turn out well, spend twice as much time with them, and half as much money. -Abigail Van Buren";
    
    th[108]="Build your own dreams, or someone else will hire you to build theirs. -Farrah Gray";
    th[109]="The battles that count aren\'t the ones for gold medals. The struggles within yourself - the invisible battles inside all of us - that\'s where it\'s at. -Jesse Owens";
    th[110]="Education costs money.  But then so does ignorance. -Sir Claus Moser";
    th[111]="I have learned over the years that when one\'s mind is made up, this diminishes fear. -Rosa Parks";
    th[112]="It does not matter how slowly you go as long as you do not stop. -Confucius";
    th[113]="If you look at what you have in life, you\'ll always have more. If you look at what you don\'t have in life, you\'ll never have enough. -Oprah Winfrey";
    th[114]="Remember that not getting what you want is sometimes a wonderful stroke of luck. -Dalai Lama";
    
    th[115]="You can\'t use up creativity.  The more you use, the more you have. -Maya Angelou";
    th[116]="Dream big and dare to fail. -Norman Vaughan";
    th[117]="Our lives begin to end the day we become silent about things that matter. -Martin Luther King Jr.";
    th[118]="Do what you can, where you are, with what you have. -Teddy Roosevelt";
    th[119]="If you do what you\'ve always done, you\'ll get what you\'ve always gotten. -Tony Robbins";
    th[120]="Dreaming, after all, is a form of planning. -Gloria Steinem";
    th[121]="It\'s your place in the world; it\'s your life. Go on and do all you can with it, and make it the life you want to live. -Mae Jemison";
    th[122]="You may be disappointed if you fail, but you are doomed if you don\'t try. -Beverly Sills";
    th[123]="Remember no one can make you feel inferior without your consent. -Eleanor Roosevelt";
    th[124]="Life is what we make it, always has been, always will be. -Grandma Moses";
    
    th[125]="The question isn\'t who is going to let me; it\'s who is going to stop me. -Ayn Rand";
    th[126]="When everything seems to be going against you, remember that the airplane takes off against the wind, not with it. -Henry Ford";
    th[127]="It\'s not the years in your life that count. It\'s the life in your years. -Abraham Lincoln";
    th[128]="Change your thoughts and you change your world. -Norman Vincent Peale";
    th[129]="Either write something worth reading or do something worth writing. -Benjamin Franklin";
    th[130]="Nothing is impossible, the word itself says, \"I\'m possible!\" -Audrey Hepburn";
    th[131]="The only way to do great work is to love what you do. -Steve Jobs";
    th[132]="If you can dream it, you can achieve it. -Zig Ziglar";
	}
	private TextView tht;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quotes);
		tht = (TextView) findViewById(R.id.textView1);
		int index = (int)(Math.random()*133);
		tht.setText(th[index]);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quotes, menu);
		return true;
	}

}
