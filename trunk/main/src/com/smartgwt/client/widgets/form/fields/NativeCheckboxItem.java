/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.form.fields;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.logical.shared.HasHandlers;
   /**
    * A checkbox for manipulating 2-valued fields based on the native checkbox element.

    */
public class NativeCheckboxItem extends FormItem {

    public static NativeCheckboxItem getOrCreateRef(JavaScriptObject jsObj) {
        RefDataClass obj = RefDataClass.getRef(jsObj);
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (NativeCheckboxItem) obj;
        } else {
            return new NativeCheckboxItem(jsObj);
        }
    }


    public NativeCheckboxItem(){
        setType("NativeCheckboxItem");
    }

    public NativeCheckboxItem(JavaScriptObject jsObj){
        super(jsObj);
    }

    public NativeCheckboxItem(String name) {
        setName(name);
        setType("NativeCheckboxItem");
    }

    // ********************* Properties / Attributes ***********************

    /**
    * Should we should the label text next to the checkbox item.
    *
    * @param showLabel showLabel Default value is true
    */
    public void setShowLabel(Boolean showLabel) {
        setAttribute("showLabel", showLabel);
    }
    /**
     * Should we should the label text next to the checkbox item.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowLabel()  {
        return getAttributeAsBoolean("showLabel");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

}



