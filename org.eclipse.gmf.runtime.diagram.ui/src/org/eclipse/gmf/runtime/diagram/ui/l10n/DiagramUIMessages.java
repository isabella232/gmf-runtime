/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmf.runtime.diagram.ui.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 *
 * @author cmahoney
 */
public final class DiagramUIMessages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages";//$NON-NLS-1$

	private DiagramUIMessages() {
		// Do not instantiate
	}

	public static String DiagramEditor_Delete_from_Diagram;
	public static String DiagramEditor_Delete_from_Model;
	public static String DiagramEditor_Delete_from_ModelToolTip;
	public static String DiagramEditor_partInitExceptionMessage;
	public static String Accessible_Connection_Label;

	public static String Accessible_Connection_From_Source;
	public static String Accessible_Connection_To_Target;
	public static String Accessible_Connection_From_Source_To_Target;

	public static String DiagramEditor_performSaveAs_message;
	public static String DiagramEditor_handleDeleteEvent_dialog_title;
	public static String DiagramEditor_handleDeleteEvent_dialog_message;
	public static String DiagramEditor_handleDeleteEvent_dialog_button_save;
	public static String DiagramEditor_handleDeleteEvent_dialog_button_close;
	public static String DiagramEditor_activated_outofsync_dialog_title;
	public static String DiagramEditor_activated_outofsync_dialog_message;
	public static String DiagramEditor_save_outofsync_dialog_title;
	public static String DiagramEditor_save_outofsync_dialog_message;
	public static String DiagramEditor_save_readonly_dialog_title;
	public static String DiagramEditor_save_readonly_dialog_message;
	public static String DiagramEditor_modifyWorkspace_label;
	public static String PropertyDescriptorFactory_Autosize;
	public static String PropertyDescriptorFactory_ShowCompartmentTitle;
	public static String PropertyDescriptorFactory_FillColor;
	public static String PropertyDescriptorFactory_LineColor;
	public static String PropertyDescriptorFactory_FontColor;
	public static String PropertyDescriptorFactory_Router;
	public static String PropertyDescriptorFactory_Smoothness;
	public static String PropertyDescriptorFactory_AvoidObstructions;
	public static String PropertyDescriptorFactory_ClosestDistance;
	public static String PropertyDescriptorFactory_Font;
	public static String PropertyDescriptorFactory_FontName;
	public static String PropertyDescriptorFactory_FontSize;
	public static String PropertyDescriptorFactory_FontStyle_Bold;
	public static String PropertyDescriptorFactory_FontStyle_Italic;
	public static String PropertyDescriptorFactory_Router_Manual;
	public static String PropertyDescriptorFactory_Router_Rectilinear;
	public static String PropertyDescriptorFactory_Router_Tree;
	public static String PropertyDescriptorFactory_JumplinksStatus;
	public static String PropertyDescriptorFactory_JumplinksStatus_None;
	public static String PropertyDescriptorFactory_JumplinksStatus_Above;
	public static String PropertyDescriptorFactory_JumplinksStatus_Below;
	public static String PropertyDescriptorFactory_JumplinksStatus_All;
	public static String PropertyDescriptorFactory_JumplinksType;
	public static String PropertyDescriptorFactory_JumplinksType_Square;
	public static String PropertyDescriptorFactory_JumplinksType_SemiCircle;
	public static String PropertyDescriptorFactory_JumplinksType_Chamfered;
	public static String PropertyDescriptorFactory_JumplinksReverse;
	public static String PropertyDescriptorFactory_Smoothness_SmoothNone;
	public static String PropertyDescriptorFactory_Smoothness_SmoothLess;
	public static String PropertyDescriptorFactory_Smoothness_SmoothNormal;
	public static String PropertyDescriptorFactory_Smoothness_SmoothMore;
	public static String PropertyDescriptorFactory_SortCompartment;
	public static String PropertyDescriptorFactory_FilterCompartment;
	public static String PropertyDescriptorFactory_CollapseCompartment;
	public static String DimensionProperty_Property_Width_Label;
	public static String DimensionProperty_Property_Height_Label;
	public static String PointProperty_Property_X_Label;
	public static String PointProperty_Property_Y_Label;
	public static String StandardGroup_Label;
	public static String StandardGroup_Description;
	public static String PaletteEntry_DefaultLabel;
	public static String PresentationGlobalActionHandler_deleteFromDiagram;
	public static String PresentationGlobalActionHandler_deleteFromDiagramToolTip;
	public static String VisualizeMenuManager_Visualize_ActionLabelText;
	public static String VisualizeMenuManager_Visualize_ActionToolTipText;
	public static String NavigateMenuManager_Navigate_ActionLabelText;
	public static String FileMenuManager_File_ActionLabelText;
	public static String FileMenuManager_File_ActionToolTipText;
	public static String EditMenuManager_Edit_ActionLabelText;
	public static String EditMenuManager_Edit_ActionToolTipText;
	public static String FiltersMenuManager_Filters_ActionLabelText;
	public static String FiltersMenuManager_Filters_ActionToolTipText;
	public static String ViewMenuManager_View_ActionLabelText;
	public static String ViewMenuManager_View_ActionToolTipText;
	public static String FormatMenuManager_Format_ActionLabelText;
	public static String FontAction_text;
	public static String FontAction_tooltip;
	public static String FontStyleAction_bold_text;
	public static String FontStyleAction_bold_tooltip;
	public static String FontStyleAction_italic_text;
	public static String FontStyleAction_italic_tooltip;
	public static String FontNameContributionItem_tooltip;
	public static String FontSizeContributionItem_tooltip;
	public static String ColorChangeActionMenu_fontColor;
	public static String ColorChangeActionMenu_lineColor;
	public static String ColorChangeActionMenu_fillColor;
	public static String ColorPropertyChangeAction_white;
	public static String ColorPropertyChangeAction_lightGray;
	public static String ColorPropertyChangeAction_gray;
	public static String ColorPropertyChangeAction_darkGray;
	public static String ColorPropertyChangeAction_black;
	public static String ColorPropertyChangeAction_red;
	public static String ColorPropertyChangeAction_pink;
	public static String ColorPropertyChangeAction_orange;
	public static String ColorPropertyChangeAction_yellow;
	public static String ColorPropertyChangeAction_green;
	public static String ColorPropertyChangeAction_magenta;
	public static String ColorPropertyChangeAction_cyan;
	public static String ColorPropertyChangeAction_blue;
	public static String ColorPropertyChangeAction_default;
	public static String ColorPropertyChangeAction_moreColors;
	public static String ColorPropertyChangeAction_clearColors;
	public static String ShowPropertiesViewAction_ActionLabelText;
	public static String ShowPropertiesViewAction_ActionToolTipText;
	public static String OpenWithMenu_OpenWithMenuText;
	public static String OpenWithMenu_OpenWithMenuTooltip;
	public static String AutoSizeAction_ActionLabelText;
	public static String AutoSizeAction_ActionToolTipText;
	public static String SnapBackAction_ActionLabelText;
	public static String SnapBackAction_ActionToolTipText;
	public static String CopyAppearancePropertiesAction_text;
	public static String CopyAppearancePropertiesAction_toolTip;
	public static String ChangeRouterAction_Rectilinear_ActionLabelText;
	public static String ChangeRouterAction_Rectilinear_ActionToolTipText;
	public static String ChangeRouterAction_Oblique_ActionLabelText;
	public static String ChangeRouterAction_Oblique_ActionToolTipText;
	public static String ChangeRouterAction_Tree_ActionLabelText;
	public static String ChangeRouterAction_Tree_ActionToolTipText;
	public static String ChangeRouterAction_ChangePropertyValueRequest_label;
	public static String ArrangeAction_ArrangeSelection_ActionLabelText;
	public static String ArrangeAction_ArrangeSelection_ActionToolTipText;
	public static String ArrangeAction_ArrangeAll_ActionLabelText;
	public static String ArrangeAction_ArrangeAll_ActionToolTipText;
	public static String ArrangeAction_toolbar_ArrangeSelection_ActionLabelText;
	public static String ArrangeAction_toolbar_ArrangeSelection_ActionToolTipText;
	public static String ArrangeAction_toolbar_ArrangeAll_ActionLabelText;
	public static String ArrangeAction_toolbar_ArrangeAll_ActionToolTipText;
	public static String ArrangeMenuManager_Arrange_ActionLabelText;
	public static String ArrangeMenuManager_Arrange_ActionToolTipText;
	public static String ShowInMenu_ShowInMenuText;
	public static String ShowInMenu_ShowInMenuTooltip;
	public static String DiagramMainMenu_DiagramMainMenuText;
	public static String RouterActionMenu_LineStyleDropDownText;
	public static String RouterActionMenu_LineStyleDropDownTooltip;
	public static String ShowAllResizableCompartmentsAction_ShowAllText;
	public static String ShowAllResizableCompartmentsAction_ShowAllTooltip;
	public static String ShowAllResizableCompartmentsAction_HideAllText;
	public static String ShowAllResizableCompartmentsAction_HideAllTooltip;
	public static String ShowResizableCompartmentActionMenu_ShowResizeableCompartmentsText;
	public static String ShowResizableCompartmentActionMenu_ShowResizeableCompartmentsTooltip;
	public static String ShowCompartmentTitle_ActionLabelText;
	public static String ShowCompartmentTitle_ActionToolTipText;
	public static String ZoomActionMenu_ZoomTooltip;
	public static String ZoomAction_ZoomCombo_Zoom100;
	public static String ZoomAction_ZoomCombo_ZoomIn;
	public static String ZoomAction_ZoomCombo_ZoomOut;
	public static String ZoomAction_ZoomCombo_ZoomToFit;
	public static String ZoomAction_ZoomCombo_ZoomToWidth;
	public static String ZoomAction_ZoomCombo_ZoomToHeight;
	public static String ZoomAction_ZoomCombo_ZoomToSelection;
	public static String ZoomActionMenu_ZoomLabel;
	public static String ZoomAction_ZoomIn;
	public static String ZoomAction_ZoomOut;
	public static String ZoomAction_Zoom100;
	public static String ZoomAction_ZoomToFit;
	public static String ZoomAction_ZoomToWidth;
	public static String ZoomAction_ZoomToHeight;
	public static String ZoomAction_ZoomToSelection;
	public static String ViewPageBreaks_textLabel;
	public static String ViewPageBreaks_toolTip;
	public static String RecalcPageBreaks_textLabel;
	public static String RecalcPageBreaks_toolTip;
	public static String ViewGrid_textLabel;
	public static String ViewGrid_toolTip;
	public static String SnapToGrid_textLabel;	
	public static String ViewRuler_textLabel;
	public static String ViewRuler_toolTip;
	public static String CopyAction_Copy;
	public static String AddBookmarkAction_dialog_title;
	public static String AddBookmarkAction_dialog_message;
	public static String SortFilterCompartmentsAction_ActionLabelText;
	public static String SortFilterCompartmentsAction_ActionToolTipText;
	public static String Note_menuItem;
	public static String Text_menuItem;
	public static String Add_menuItem;
	public static String AddNoteAction_ActionLabelText;
	public static String AddNoteAction_ActionToolTipText;
	public static String SameSizeMenuManager_MakeSameSize_ActionLabelText;
	public static String SameSizeMenuManager_MakeSameSize_ActionToolTipText;
	public static String SameSizeAction_MakeSameSizeBoth_ActionLabelText;
	public static String SameSizeAction_MakeSameSizeBoth_ActionToolTipText;
	public static String SameSizeAction_MakeSameSizeHeight_ActionLabelText;
	public static String SameSizeAction_MakeSameSizeHeight_ActionToolTipText;
	public static String SameSizeAction_MakeSameSizeWidth_ActionLabelText;
	public static String SameSizeAction_MakeSameSizeWidth_ActionToolTipText;
	public static String Open_ActionLabelText;
	public static String Open_ActionToolTipText;
	public static String Command_Create_Label;
	public static String Command_createGuide;
	public static String Command_deleteGuide;
	public static String Command_moveGuide;
	public static String Command_Show_Hide_Relationships;
	public static String Command_ShowRelatedElements;
	public static String Commands_SetBendpointsCommand_Label;
	public static String SetAutoSizeCommand_Label;
	public static String CreateConnectionCommand_Label;
	public static String DeleteCommand_Label;
	public static String AddCommand_Label;
	public static String Command_CreateDiagramLink;
	public static String CreateCommand_Label;
	public static String SetLocationCommand_Label_Resize;
	public static String Command_ChangeViewProperty_ChangePropertyPattern;
	public static String Commands_CreateCommand_Connection_Label;
	public static String Command_Deferred_Layout;
	public static String SnapCommand_Label;
	public static String Commands_SetConnectionEndsCommand_Target;
	public static String Commands_SetConnectionEndsCommand_Source;
	public static String Commands_DestroyElement;
	public static String Commands_MoveElement;
	public static String MoveLabelCommand_Label_Location;
	public static String Command_AdjustRatioCommand_Label;
	public static String Command_openDiagram;
	public static String Command_hideLabel_Label;
	public static String ConstrainedFlowLayoutEditPolicy_changeVisibilityCommand_label;
	public static String GraphicalNodeEditPolicy_createRelationshipCommand_label;
	public static String ResizableShapeEditPolicy_MoveDeferredCommand_label;
	public static String RadialProvider_changeFontRequest_label;
	public static String RadialProvider_changeVisibilityRequest_label;
	public static String Command_SortFilterCommand;
	public static String SnapBackCommand_Label;
	public static String PasteCommand_Label;
	public static String ToggleCanonicalModeCommand_Label;
	public static String SetViewMutabilityCommand_Label;
	public static String CanonicalLayoutCommand_Label;
	public static String ShowHideLabelsCommand_Label;
	public static String Command_CreateRelationship_Label;
	public static String Command_GetRelationshipTypeAndEndFromUser_Label;
	public static String Commands_Duplicate_Label;
	public static String CopyToImageDialog_title;
	public static String CopyToImageDialog_folder_label;
	public static String CopyToImageDialog_filename_label;
	public static String CopyToImageDialog_filename_default;
	public static String CopyToImageDialog_imageformat_label;
	/**
	 * @since 1.4
	 */
	public static String CopyToImageDialog_quality_label;
	/**
	 * @since 1.4
	 */
	public static String CopyToImageDialog_quality_error_message;
	public static String CopyToImageDialog_browse_label;
	public static String CopyToImageDialog_DirectoryDialog_text;
	public static String CopyToImageDialog_DirectoryDialog_message;
	public static String CopyToImageDialog_overwriteExisting_label;
	public static String CopyToImageDialog_validateFolderText_folderBlank;
	public static String CopyToImageDialog_validateFolderText_folderInvalid;
	public static String CopyToImageDialog_validateFolderText_folderNotExist;
	public static String CopyToImageDialog_exportToHTML_label;
	public static String CopyToHTMLImageTask_generateImageFile;
	public static String CopyToHTMLImageTask_exportingToHTML;
	public static String SortFilterDialog_title;
	public static String SortFilterDialog_rootTitle;
	public static String SortFilter_moveItemUp;
	public static String SortFilter_moveItemDown;
	public static String SortFilter_filterItemsListLabel;
	public static String SortFilter_fitlerListLabel;
	public static String SortFilter_addTo;
	public static String SortFilter_removeFrom;
	public static String SortFilter_addAll;
	public static String SortFilter_removeAll;
	public static String SortFilter_apply;
	public static String MessageDialogWithToggle_DoNotPromptAgainToggle_label;
	public static String PromptingDeleteAction_DeleteFromDiagramDialog_Title;
	public static String PromptingDeleteAction_DeleteFromDiagramDialog_Message;
	public static String PromptingDeleteFromModelAction_DeleteFromModelDialog_Title;
	public static String PromptingDeleteFromModelAction_DeleteFromModelDialog_Message;
	public static String DiagramsPreferencePage_showConnectionHandles_label;
	public static String DiagramsPreferencePage_globalGroup_label;
	public static String DiagramsPreferencePage_showPopupBars_label;
	public static String DiagramsPreferencePage_enableAnimatedLayout_label;
	public static String DiagramsPreferencePage_enableAnimatedZoom_label;
	public static String DiagramsPreferencePage_enableAntiAlias_label;
	/**
	 * @since 1.2
	 */
	public static String DiagramsPreferencePage_showStatusLine_label;
	public static String GridRulerPreferencePage_rulerGroup_label;
	public static String GridRulerPreferencePage_showRulers_label;
	public static String GridRulerPreferencePage_rulerUnits_label;
	public static String GridRulerPreferencePage_rulerUnits_inch_label;
	public static String GridRulerPreferencePage_rulerUnits_cm_label;
	public static String GridRulerPreferencePage_rulerUnits_pixel_label;
	public static String GridRulerPreferencePage_gridGroup_label;
	public static String GridRulerPreferencePage_showGrid_label;
	public static String GridRulerPreferencePage_snapToGrid_label;
	public static String GridRulerPreferencePage_snapToGeometry_label;
	public static String GridRulerPreferencePage_gridSpacing_label_inches;
    public static String GridRulerPreferencePage_gridSpacing_label_cm;
    public static String GridRulerPreferencePage_gridSpacing_label_pixels;
	public static String GeneralPreferencePage_defaultFont_label;
	public static String GeneralPreferencePage_fontColor_label;
	public static String GeneralPreferencePage_fillColor_label;
	public static String GeneralPreferencePage_lineColor_label;
	public static String GeneralPreferencePage_noteFillColor_label;
	public static String GeneralPreferencePage_noteLineColor_label;
	public static String GeneralPreferencePage_colorAndFontGroupBox_label;
	public static String ConnectionsPreferencePage_lineStyle_label;
	public static String ConnectionsPreferencePage_ConnectionView_Manual_text;
	public static String ConnectionsPreferencePage_ConnectionView_Rectilinear_text;
	public static String AbstractEditPartProvider_new_graphicaleditpart_failed_ERROR_;
	public static String AbstractViewProvider_create_view_failed_ERROR_;
	public static String CanonicalEditPolicy_create_view_failed_ERROR_;
	public static String CanonicalEditPolicy_refresh_failed_ERROR_;
	public static String RefreshEditPartCompartment_execute_failed_ERROR_;
	public static String PopupBar_AddNew;
	public static String ConnectionHandle_ToolTip_ShowRelatedElementsOnly;
	public static String ConnectionHandle_ToolTip_ShowRelatedElementsAndCreateRelationship;
	public static String ConnectionHandle_ToolTip_CreateRelationshipOnly;
	public static String ConnectionHandle_Popup_ShowRelatedElementsDialog;
	public static String ConnectionHandle_Popup_ShowRelatedXRelationships;
	public static String ConnectionHandle_Popup_ExistingElement;
	public static String ConnectionHandle_Popup_NewX;
	public static String ConnectionHandle_Popup_CreateXFrom;
	public static String ConnectionHandle_Popup_CreateXTo;
	public static String ConnectionHandle_Popup_CreateXFromY;
	public static String ConnectionHandle_Popup_CreateXToY;
	public static String ConnectionHandle_Popup_CreateXFromNewY;
	public static String ConnectionHandle_Popup_CreateXToNewY;
	public static String CreateViewAndOptionallyElementCommand_ViewExists_Message;
	public static String CreateViewAndOptionallyElementCommand_ViewExists_Title;
	public static String PageSetupPreferencePage_title;
	public static String PrintPreferencePage_instruction;
	public static String PageSetupDialog_title;
	public static String PageSetupDialog_title_tab;
	public static String PageSetupDialog_title_group_unit;
	public static String PageSetupDialog_button_inches;
	public static String PageSetupDialog_button_millimetres;
	public static String PageSetupDialog_title_group_orientation;
	public static String PageSetupDialog_button_portrait;
	public static String PageSetupDialog_button_landscape;
	public static String PageSetupDialog_title_group_paperSize;
	public static String PageSetupDialog_text_page_size;
	public static String PageSetupDialog_text_page_width_inches;
    public static String PageSetupDialog_text_page_width_mm;
    public static String PageSetupDialog_text_page_height_inches;
    public static String PageSetupDialog_text_page_height_mm;
	public static String PageSetupDialog_title_group_margin;
	public static String PageSetupDialog_text_page_margin_top_inches;
    public static String PageSetupDialog_text_page_margin_top_mm;
	public static String PageSetupDialog_text_page_margin_bottom_inches;
    public static String PageSetupDialog_text_page_margin_bottom_mm;
	public static String PageSetupDialog_text_page_margin_left_inches;
    public static String PageSetupDialog_text_page_margin_left_mm;
	public static String PageSetupDialog_text_page_margin_right_inches;
    public static String PageSetupDialog_text_page_margin_right_mm;
	public static String PageSetupDialog_label_inches;
	public static String PageSetupDialog_label_millimetres;
	public static String PrintPreferencePage_message_error;
	public static String PageSetupDialog_button_workspace;
	public static String PageSetupDialog_button_diagram;
	public static String PageSetupDialog_button_configure;
	public static String PageSetupDialog_paper_size_letter;
	public static String PageSetupDialog_paper_size_legal;
	public static String PageSetupDialog_paper_size_executive;
	public static String PageSetupDialog_paper_size_11by17;
	public static String PageSetupDialog_paper_size_A3;
	public static String PageSetupDialog_paper_size_A4;
	public static String PageSetupDialog_paper_size_B4;
	public static String PageSetupDialog_paper_size_B5;
	public static String PageSetupDialog_paper_size_userDefined;
	public static String PageSetupAction_Label;
	public static String Note_DisplayName;
	public static String NoteAttachment_DisplayName;
	public static String Text_DisplayName;
	public static String DiagramGeneralDetails_nameLabel_text;
	public static String DiagramGeneralDetails_diagramTypeLabel_text;
	public static String DiagramGeneralDetails_diagramDescriptionLabel_text;
	public static String DiagramGeneralDetails_nameChangeCommand_text;
	public static String DiagramGeneralDetails_diagramDescriptionChangeCommand_text;
	public static String ConnectionAppearancePropertySection_Router_Manual;
	public static String ConnectionAppearancePropertySection_Router_Rectilinear;
	public static String ConnectionAppearancePropertySection_Router_Tree;
	public static String InvalidView;
	public static String OutlineView_OutlineTipText;
	public static String OutlineView_OverviewTipText;
	public static String DeleteFromModelAction_ErrorDialog_Title;
	public static String DeleteFromModelAction_ErrorDialog_Text;

	static {
		NLS.initializeMessages(BUNDLE_NAME, DiagramUIMessages.class);
	}
}