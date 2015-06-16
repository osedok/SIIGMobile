/*
 * GeoSolutions map - Digital field mapping on Android based devices
 * Copyright (C) 2013  GeoSolutions (www.geo-solutions.it)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.android.map.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Lorenzo Natali (www.geo-solutions.it)
 *
 */
public class Attribute implements Parcelable{
	private String name;
	private String value;
	public Attribute(){};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	/* (non-Javadoc)
	 * @see android.os.Parcelable#describeContents()
	 */
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	/* (non-Javadoc)
	 * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeString(value);
	}
	
	public Attribute(Parcel in){
		name=in.readString();
		value=in.readString();
	}
	
	 public static final Creator<Attribute> CREATOR
     = new Creator<Attribute>() {
	 public Attribute createFromParcel(Parcel in) {
	     return new Attribute(in);
	 }

	 public Attribute[] newArray(int size) {
	     return new Attribute[size];
	 }
	 };
}
