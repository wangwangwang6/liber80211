/**
 * Copyright 2012 Bryce Thomas <bryce.m.thomas@gmail.com>
 * 
 * Based on the Linux RTL8187 driver, which is:
 * Copyright 2007 Michael Wu <flamingice@sourmilk.net>
 * Copyright 2007 Andrea Merello <andreamrl@tiscali.it>
 * 
 * liber80211 is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 */

package com.brycestrosoft.liber80211;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;

/*
 * Class meant to support different operations for different variants of Wi-Fi chipset.
 * Not really in use yet.
 */
public abstract class rtl818xRfOps {

	public void rtl8225RfSetChannel(UsbDevice device, UsbManager manager) {
		// TODO: implement this
	}
	
	public void rtl8225RfStop(UsbDevice device, UsbManager manager) {
		// TODO: implement this
	}
	
	public abstract void rtl8225RfInit(UsbDevice device, UsbManager manager);
}
