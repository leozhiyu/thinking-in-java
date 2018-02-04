// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IterableClass.java

package com.leozzy.eleven.collection;

import java.io.PrintStream;
import java.util.Iterator;

public class IterableClass
	implements Iterable
{

	protected String words[];

	public IterableClass()
	{
		words = "And that is how we know the Earth to be banana-shaped.".split(" ");
	}

	public Iterator iterator()
	{
		return new Iterator() {

			private Integer index;
			final IterableClass this$0;

			public boolean hasNext()
			{
				return index.intValue() < words.length;
			}

			public String next()
			{
				Integer integer = index;
				Integer integer1 = index = Integer.valueOf(index.intValue() + 1);
				return words[integer.intValue()];
			}

			public void remove()
			{
				throw new UnsupportedOperationException();
			}

			public volatile Object next()
			{
				return next();
			}

			
			{
				this.this$0 = IterableClass.this;
				super();
				index = Integer.valueOf(0);
			}
		};
	}

	public static void main(String args[])
	{
		String s;
		for (Iterator iterator1 = (new IterableClass()).iterator(); iterator1.hasNext(); System.out.print((new StringBuilder()).append(s).append(" ").toString()))
			s = (String)iterator1.next();

	}
}
