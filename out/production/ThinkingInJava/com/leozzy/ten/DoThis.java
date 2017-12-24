// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DoThis.java

package com.leozzy.ten;

import java.io.PrintStream;

public class DoThis
{
	public class Inner
	{

		final DoThis this$0;

		public DoThis getOuter()
		{
			return DoThis.this;
		}

		public Inner()
		{
			this.this$0 = DoThis.this;
			super();
		}
	}


	public DoThis()
	{
	}

	public void f()
	{
		System.out.println("do this");
	}

	public Inner getInner()
	{
		return new Inner();
	}

	public static void main(String args[])
	{
		DoThis outer = new DoThis();
		Inner in = outer.getInner();
		in.getOuter().f();
	}
}
