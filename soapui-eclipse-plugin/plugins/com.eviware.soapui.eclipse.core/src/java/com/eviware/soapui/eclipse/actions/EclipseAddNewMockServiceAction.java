/*
 *  soapUI, copyright (C) 2004-2011 smartbear.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package com.eviware.soapui.eclipse.actions;

import com.eviware.soapui.impl.wsdl.actions.project.AddNewMockServiceAction;
import com.eviware.soapui.model.project.Project;

/**
 * 
 * @author Dain Nilsson
 */
public class EclipseAddNewMockServiceAction extends AdaptSoapuiObjectAction<Project>
{
   public EclipseAddNewMockServiceAction()
   {
      super(Project.class, AddNewMockServiceAction.class);
   }
}
