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
 
package com.smartgwt.client.widgets.tab.events;



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
import com.google.gwt.event.shared.HasHandlers;
public class TabCloseClickEvent extends BrowserEvent<CloseClickHandler>  {

  /**
   * Handler type.
   */
  private static Type<CloseClickHandler> TYPE;

  /**
   * Fires a open event on all registered handlers in the handler manager.If no
   * such handlers exist, this method will do nothing.
   *
   * @param <S> The event source
   * @param source the source of the handlers
   * @param target the target
   */
  public static <S extends HasCloseClickHandlers & HasHandlers> void fire(
      S source, JavaScriptObject jsObj) {
    if (TYPE != null) {
      HandlerManager handlers = source.getHandlers();
      if (handlers != null) {
        TabCloseClickEvent event = new TabCloseClickEvent(jsObj);
        handlers.fireEvent(event);
      }
    }
  }

  /**
   * Gets the type associated with this event.
   *
   * @return returns the handler type
   */
  public static Type<CloseClickHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<CloseClickHandler>();
    }
    return TYPE;
  }


  @Override
  protected void dispatch(CloseClickHandler handler) {
    handler.onCloseClick(this);
  }

  // Because of type erasure, our static type is
  // wild carded, yet the "real" type should use our I param.

  @SuppressWarnings("unchecked")
  @Override
  public final Type<CloseClickHandler> getAssociatedType() {
    return TYPE;
  }

    public TabCloseClickEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }



    /**
     * tab to close
     *
     * @return tab to close
     */
    public  native Tab getTab() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
            var retVal = @com.smartgwt.client.widgets.tab.Tab::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.tab);
            if(retVal == null) {
                retVal = @com.smartgwt.client.widgets.tab.Tab::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.tab);
            }
            return retVal;
    }-*/;


}
