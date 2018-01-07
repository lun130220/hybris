/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2018/1/7 下午 01:42:12                        ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.core.model.security;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.SyncItemJobModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.comments.model.CommentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.type.SearchRestrictionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type Principal first defined at extension core.
 */
@SuppressWarnings("all")
public class PrincipalModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Principal";
	
	/**<i>Generated relation code constant for relation <code>Category2PrincipalRelation</code> defining source attribute <code>accessibleCategories</code> in extension <code>catalog</code>.</i>*/
	public final static String _CATEGORY2PRINCIPALRELATION = "Category2PrincipalRelation";
	
	/**<i>Generated relation code constant for relation <code>SyncItemJob2Principal</code> defining source attribute <code>syncJobs</code> in extension <code>catalog</code>.</i>*/
	public final static String _SYNCITEMJOB2PRINCIPAL = "SyncItemJob2Principal";
	
	/**<i>Generated relation code constant for relation <code>WorkflowTemplate2PrincipalRelation</code> defining source attribute <code>visibleTemplates</code> in extension <code>workflow</code>.</i>*/
	public final static String _WORKFLOWTEMPLATE2PRINCIPALRELATION = "WorkflowTemplate2PrincipalRelation";
	
	/**<i>Generated relation code constant for relation <code>CommentWatcherRelation</code> defining source attribute <code>watchedComments</code> in extension <code>comments</code>.</i>*/
	public final static String _COMMENTWATCHERRELATION = "CommentWatcherRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.description</code> attribute defined at extension <code>core</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.name</code> attribute defined at extension <code>core</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.displayName</code> attribute defined at extension <code>core</code>. */
	public static final String DISPLAYNAME = "displayName";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.uid</code> attribute defined at extension <code>core</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.allSearchRestrictions</code> attribute defined at extension <code>core</code>. */
	public static final String ALLSEARCHRESTRICTIONS = "allSearchRestrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.allGroups</code> attribute defined at extension <code>core</code>. */
	public static final String ALLGROUPS = "allGroups";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.groups</code> attribute defined at extension <code>core</code>. */
	public static final String GROUPS = "groups";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.searchRestrictions</code> attribute defined at extension <code>core</code>. */
	public static final String SEARCHRESTRICTIONS = "searchRestrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.accessibleCategories</code> attribute defined at extension <code>catalog</code>. */
	public static final String ACCESSIBLECATEGORIES = "accessibleCategories";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.writableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String WRITABLECATALOGVERSIONS = "writableCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.readableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String READABLECATALOGVERSIONS = "readableCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.syncJobs</code> attribute defined at extension <code>catalog</code>. */
	public static final String SYNCJOBS = "syncJobs";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.visibleTemplates</code> attribute defined at extension <code>workflow</code>. */
	public static final String VISIBLETEMPLATES = "visibleTemplates";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.profilePicture</code> attribute defined at extension <code>comments</code>. */
	public static final String PROFILEPICTURE = "profilePicture";
	
	/** <i>Generated constant</i> - Attribute key of <code>Principal.watchedComments</code> attribute defined at extension <code>comments</code>. */
	public static final String WATCHEDCOMMENTS = "watchedComments";
	
	
	/** <i>Generated variable</i> - Variable of <code>Principal.description</code> attribute defined at extension <code>core</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.name</code> attribute defined at extension <code>core</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.uid</code> attribute defined at extension <code>core</code>. */
	private String _uid;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.allSearchRestrictions</code> attribute defined at extension <code>core</code>. */
	private Collection<SearchRestrictionModel> _allSearchRestrictions;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.allGroups</code> attribute defined at extension <code>core</code>. */
	private Set<PrincipalGroupModel> _allGroups;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.groups</code> attribute defined at extension <code>core</code>. */
	private Set<PrincipalGroupModel> _groups;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.searchRestrictions</code> attribute defined at extension <code>core</code>. */
	private Collection<SearchRestrictionModel> _searchRestrictions;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.accessibleCategories</code> attribute defined at extension <code>catalog</code>. */
	private Collection<CategoryModel> _accessibleCategories;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.writableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	private List<CatalogVersionModel> _writableCatalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.readableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	private List<CatalogVersionModel> _readableCatalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.syncJobs</code> attribute defined at extension <code>catalog</code>. */
	private Collection<SyncItemJobModel> _syncJobs;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.visibleTemplates</code> attribute defined at extension <code>workflow</code>. */
	private Collection<WorkflowTemplateModel> _visibleTemplates;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.profilePicture</code> attribute defined at extension <code>comments</code>. */
	private MediaModel _profilePicture;
	
	/** <i>Generated variable</i> - Variable of <code>Principal.watchedComments</code> attribute defined at extension <code>comments</code>. */
	private List<CommentModel> _watchedComments;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PrincipalModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PrincipalModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public PrincipalModel(final String _uid)
	{
		super();
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public PrincipalModel(final ItemModel _owner, final String _uid)
	{
		super();
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.accessibleCategories</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the accessibleCategories - catalog categories which are accessible for this principal
	 */
	@Accessor(qualifier = "accessibleCategories", type = Accessor.Type.GETTER)
	public Collection<CategoryModel> getAccessibleCategories()
	{
		if (this._accessibleCategories!=null)
		{
			return _accessibleCategories;
		}
		return _accessibleCategories = getPersistenceContext().getValue(ACCESSIBLECATEGORIES, _accessibleCategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.allGroups</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allGroups
	 * @deprecated use {@link #getAllGroups()} instead
	 */
	@Deprecated
	public Set<PrincipalGroupModel> getAllgroups()
	{
		return this.getAllGroups();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.allGroups</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allGroups
	 */
	@Accessor(qualifier = "allGroups", type = Accessor.Type.GETTER)
	public Set<PrincipalGroupModel> getAllGroups()
	{
		if (this._allGroups!=null)
		{
			return _allGroups;
		}
		return _allGroups = getPersistenceContext().getValue(ALLGROUPS, _allGroups);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.allSearchRestrictions</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allSearchRestrictions
	 * @deprecated use {@link #getAllSearchRestrictions()} instead
	 */
	@Deprecated
	public Collection<SearchRestrictionModel> getAllsearchrestrictions()
	{
		return this.getAllSearchRestrictions();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.allSearchRestrictions</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allSearchRestrictions
	 */
	@Accessor(qualifier = "allSearchRestrictions", type = Accessor.Type.GETTER)
	public Collection<SearchRestrictionModel> getAllSearchRestrictions()
	{
		if (this._allSearchRestrictions!=null)
		{
			return _allSearchRestrictions;
		}
		return _allSearchRestrictions = getPersistenceContext().getValue(ALLSEARCHRESTRICTIONS, _allSearchRestrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.description</code> attribute defined at extension <code>core</code>. 
	 * @return the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.displayName</code> attribute defined at extension <code>core</code>. 
	 * @return the displayName
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.GETTER)
	public String getDisplayName()
	{
		return getDisplayName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.displayName</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the displayName
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.GETTER)
	public String getDisplayName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DISPLAYNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.groups</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the groups
	 */
	@Accessor(qualifier = "groups", type = Accessor.Type.GETTER)
	public Set<PrincipalGroupModel> getGroups()
	{
		if (this._groups!=null)
		{
			return _groups;
		}
		return _groups = getPersistenceContext().getValue(GROUPS, _groups);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.name</code> attribute defined at extension <code>core</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.profilePicture</code> attribute defined at extension <code>comments</code>. 
	 * @return the profilePicture
	 */
	@Accessor(qualifier = "profilePicture", type = Accessor.Type.GETTER)
	public MediaModel getProfilePicture()
	{
		if (this._profilePicture!=null)
		{
			return _profilePicture;
		}
		return _profilePicture = getPersistenceContext().getValue(PROFILEPICTURE, _profilePicture);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.readableCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the readableCatalogVersions
	 */
	@Accessor(qualifier = "readableCatalogVersions", type = Accessor.Type.GETTER)
	public List<CatalogVersionModel> getReadableCatalogVersions()
	{
		if (this._readableCatalogVersions!=null)
		{
			return _readableCatalogVersions;
		}
		return _readableCatalogVersions = getPersistenceContext().getValue(READABLECATALOGVERSIONS, _readableCatalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.searchRestrictions</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the searchRestrictions
	 * @deprecated use {@link #getSearchRestrictions()} instead
	 */
	@Deprecated
	public Collection<SearchRestrictionModel> getSearchrestrictions()
	{
		return this.getSearchRestrictions();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.searchRestrictions</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the searchRestrictions
	 */
	@Accessor(qualifier = "searchRestrictions", type = Accessor.Type.GETTER)
	public Collection<SearchRestrictionModel> getSearchRestrictions()
	{
		if (this._searchRestrictions!=null)
		{
			return _searchRestrictions;
		}
		return _searchRestrictions = getPersistenceContext().getValue(SEARCHRESTRICTIONS, _searchRestrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.syncJobs</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the syncJobs
	 */
	@Accessor(qualifier = "syncJobs", type = Accessor.Type.GETTER)
	public Collection<SyncItemJobModel> getSyncJobs()
	{
		if (this._syncJobs!=null)
		{
			return _syncJobs;
		}
		return _syncJobs = getPersistenceContext().getValue(SYNCJOBS, _syncJobs);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.uid</code> attribute defined at extension <code>core</code>. 
	 * @return the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.GETTER)
	public String getUid()
	{
		if (this._uid!=null)
		{
			return _uid;
		}
		return _uid = getPersistenceContext().getValue(UID, _uid);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.visibleTemplates</code> attribute defined at extension <code>workflow</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the visibleTemplates
	 */
	@Accessor(qualifier = "visibleTemplates", type = Accessor.Type.GETTER)
	public Collection<WorkflowTemplateModel> getVisibleTemplates()
	{
		if (this._visibleTemplates!=null)
		{
			return _visibleTemplates;
		}
		return _visibleTemplates = getPersistenceContext().getValue(VISIBLETEMPLATES, _visibleTemplates);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.watchedComments</code> attribute defined at extension <code>comments</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the watchedComments
	 */
	@Accessor(qualifier = "watchedComments", type = Accessor.Type.GETTER)
	public List<CommentModel> getWatchedComments()
	{
		if (this._watchedComments!=null)
		{
			return _watchedComments;
		}
		return _watchedComments = getPersistenceContext().getValue(WATCHEDCOMMENTS, _watchedComments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.writableCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the writableCatalogVersions
	 */
	@Accessor(qualifier = "writableCatalogVersions", type = Accessor.Type.GETTER)
	public List<CatalogVersionModel> getWritableCatalogVersions()
	{
		if (this._writableCatalogVersions!=null)
		{
			return _writableCatalogVersions;
		}
		return _writableCatalogVersions = getPersistenceContext().getValue(WRITABLECATALOGVERSIONS, _writableCatalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.description</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.groups</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the groups
	 */
	@Accessor(qualifier = "groups", type = Accessor.Type.SETTER)
	public void setGroups(final Set<PrincipalGroupModel> value)
	{
		_groups = getPersistenceContext().setValue(GROUPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.profilePicture</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the profilePicture
	 */
	@Accessor(qualifier = "profilePicture", type = Accessor.Type.SETTER)
	public void setProfilePicture(final MediaModel value)
	{
		_profilePicture = getPersistenceContext().setValue(PROFILEPICTURE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.readableCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the readableCatalogVersions
	 */
	@Accessor(qualifier = "readableCatalogVersions", type = Accessor.Type.SETTER)
	public void setReadableCatalogVersions(final List<CatalogVersionModel> value)
	{
		_readableCatalogVersions = getPersistenceContext().setValue(READABLECATALOGVERSIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.syncJobs</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the syncJobs
	 */
	@Accessor(qualifier = "syncJobs", type = Accessor.Type.SETTER)
	public void setSyncJobs(final Collection<SyncItemJobModel> value)
	{
		_syncJobs = getPersistenceContext().setValue(SYNCJOBS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.uid</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.SETTER)
	public void setUid(final String value)
	{
		_uid = getPersistenceContext().setValue(UID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.visibleTemplates</code> attribute defined at extension <code>workflow</code>. 
	 *  
	 * @param value the visibleTemplates
	 */
	@Accessor(qualifier = "visibleTemplates", type = Accessor.Type.SETTER)
	public void setVisibleTemplates(final Collection<WorkflowTemplateModel> value)
	{
		_visibleTemplates = getPersistenceContext().setValue(VISIBLETEMPLATES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.watchedComments</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the watchedComments
	 */
	@Accessor(qualifier = "watchedComments", type = Accessor.Type.SETTER)
	public void setWatchedComments(final List<CommentModel> value)
	{
		_watchedComments = getPersistenceContext().setValue(WATCHEDCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Principal.writableCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the writableCatalogVersions
	 */
	@Accessor(qualifier = "writableCatalogVersions", type = Accessor.Type.SETTER)
	public void setWritableCatalogVersions(final List<CatalogVersionModel> value)
	{
		_writableCatalogVersions = getPersistenceContext().setValue(WRITABLECATALOGVERSIONS, value);
	}
	
}
