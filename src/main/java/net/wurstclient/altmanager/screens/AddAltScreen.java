/*
 * Copyright (C) 2014 - 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.altmanager.screens;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.LiteralText;
import net.wurstclient.altmanager.AltManager;

public final class AddAltScreen extends AltEditorScreen
{
	private final AltManager altManager;
	
	public AddAltScreen(Screen prevScreen, AltManager altManager)
	{
		super(prevScreen, new LiteralText("New Alt"));
		this.altManager = altManager;
	}
	
	@Override
	protected String getDoneButtonText()
	{
		return "Add";
	}
	
	@Override
	protected void pressDoneButton()
	{
		altManager.add(getEmail(), getPassword(), false);
		minecraft.openScreen(prevScreen);
	}
}
