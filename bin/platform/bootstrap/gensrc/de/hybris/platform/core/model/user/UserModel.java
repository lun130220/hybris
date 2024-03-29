/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2018/1/7 下午 03:03:30                        ---
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
package de.hybris.platform.core.model.user;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.comments.model.AbstractCommentModel;
import de.hybris.platform.comments.model.CommentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.core.model.user.AbstractContactInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.europe1.enums.UserDiscountGroup;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.europe1.enums.UserTaxGroup;
import de.hybris.platform.europe1.model.GlobalDiscountRowModel;
import de.hybris.platform.hmc.model.UserProfileModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type User first defined at extension core.
 */
@SuppressWarnings("all")
public class UserModel extends PrincipalModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "User";
	
	/**<i>Generated relation code constant for relation <code>AbstractCommentAuthorRelation</code> defining source attribute <code>createdComments</code> in extension <code>comments</code>.</i>*/
	public final static String _ABSTRACTCOMMENTAUTHORRELATION = "AbstractCommentAuthorRelation";
	
	/**<i>Generated relation code constant for relation <code>CommentAssigneeRelation</code> defining source attribute <code>assignedComments</code> in extension <code>comments</code>.</i>*/
	public final static String _COMMENTASSIGNEERELATION = "CommentAssigneeRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.currentTime</code> attribute defined at extension <code>core</code>. */
	public static final String CURRENTTIME = "currentTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.currentDate</code> attribute defined at extension <code>core</code>. */
	public static final String CURRENTDATE = "currentDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.addresses</code> attribute defined at extension <code>core</code>. */
	public static final String ADDRESSES = "addresses";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.carts</code> attribute defined at extension <code>core</code>. */
	public static final String CARTS = "carts";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. */
	public static final String DEFAULTPAYMENTADDRESS = "defaultPaymentAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. */
	public static final String DEFAULTSHIPMENTADDRESS = "defaultShipmentAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.orders</code> attribute defined at extension <code>core</code>. */
	public static final String ORDERS = "orders";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. */
	public static final String PASSWORDENCODING = "passwordEncoding";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. */
	public static final String ENCODEDPASSWORD = "encodedPassword";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. */
	public static final String PASSWORDANSWER = "passwordAnswer";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. */
	public static final String PASSWORDQUESTION = "passwordQuestion";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTINFOS = "paymentInfos";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. */
	public static final String SESSIONLANGUAGE = "sessionLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. */
	public static final String SESSIONCURRENCY = "sessionCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. */
	public static final String LOGINDISABLED = "loginDisabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.lastLogin</code> attribute defined at extension <code>core</code>. */
	public static final String LASTLOGIN = "lastLogin";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. */
	public static final String HMCLOGINDISABLED = "hmcLoginDisabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.userprofile</code> attribute defined at extension <code>core</code>. */
	public static final String USERPROFILE = "userprofile";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.contactInfos</code> attribute defined at extension <code>core</code>. */
	public static final String CONTACTINFOS = "contactInfos";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String ALLWRITEABLECATALOGVERSIONS = "allWriteableCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_UDG = "Europe1PriceFactory_UDG";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_UPG = "Europe1PriceFactory_UPG";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_UTG = "Europe1PriceFactory_UTG";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1DISCOUNTS = "europe1Discounts";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.createdComments</code> attribute defined at extension <code>comments</code>. */
	public static final String CREATEDCOMMENTS = "createdComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. */
	public static final String ASSIGNEDCOMMENTS = "assignedComments";
	
	
	/** <i>Generated variable</i> - Variable of <code>User.currentTime</code> attribute defined at extension <code>core</code>. */
	private Date _currentTime;
	
	/** <i>Generated variable</i> - Variable of <code>User.currentDate</code> attribute defined at extension <code>core</code>. */
	private Date _currentDate;
	
	/** <i>Generated variable</i> - Variable of <code>User.addresses</code> attribute defined at extension <code>core</code>. */
	private Collection<AddressModel> _addresses;
	
	/** <i>Generated variable</i> - Variable of <code>User.carts</code> attribute defined at extension <code>core</code>. */
	private Collection<CartModel> _carts;
	
	/** <i>Generated variable</i> - Variable of <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. */
	private AddressModel _defaultPaymentAddress;
	
	/** <i>Generated variable</i> - Variable of <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. */
	private AddressModel _defaultShipmentAddress;
	
	/** <i>Generated variable</i> - Variable of <code>User.orders</code> attribute defined at extension <code>core</code>. */
	private Collection<OrderModel> _orders;
	
	/** <i>Generated variable</i> - Variable of <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. */
	private String _passwordEncoding;
	
	/** <i>Generated variable</i> - Variable of <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. */
	private String _encodedPassword;
	
	/** <i>Generated variable</i> - Variable of <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. */
	private String _passwordAnswer;
	
	/** <i>Generated variable</i> - Variable of <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. */
	private String _passwordQuestion;
	
	/** <i>Generated variable</i> - Variable of <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. */
	private Collection<PaymentInfoModel> _paymentInfos;
	
	/** <i>Generated variable</i> - Variable of <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. */
	private LanguageModel _sessionLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. */
	private CurrencyModel _sessionCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. */
	private Boolean _loginDisabled;
	
	/** <i>Generated variable</i> - Variable of <code>User.lastLogin</code> attribute defined at extension <code>core</code>. */
	private Date _lastLogin;
	
	/** <i>Generated variable</i> - Variable of <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. */
	private Boolean _hmcLoginDisabled;
	
	/** <i>Generated variable</i> - Variable of <code>User.userprofile</code> attribute defined at extension <code>core</code>. */
	private UserProfileModel _userprofile;
	
	/** <i>Generated variable</i> - Variable of <code>User.contactInfos</code> attribute defined at extension <code>core</code>. */
	private Collection<AbstractContactInfoModel> _contactInfos;
	
	/** <i>Generated variable</i> - Variable of <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	private Collection<CatalogVersionModel> _allWriteableCatalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. */
	private UserDiscountGroup _Europe1PriceFactory_UDG;
	
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. */
	private UserPriceGroup _Europe1PriceFactory_UPG;
	
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. */
	private UserTaxGroup _Europe1PriceFactory_UTG;
	
	/** <i>Generated variable</i> - Variable of <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. */
	private Collection<GlobalDiscountRowModel> _europe1Discounts;
	
	/** <i>Generated variable</i> - Variable of <code>User.createdComments</code> attribute defined at extension <code>comments</code>. */
	private List<AbstractCommentModel> _createdComments;
	
	/** <i>Generated variable</i> - Variable of <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. */
	private List<CommentModel> _assignedComments;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public UserModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public UserModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public UserModel(final boolean _loginDisabled, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public UserModel(final boolean _loginDisabled, final ItemModel _owner, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.addresses</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the addresses
	 */
	@Accessor(qualifier = "addresses", type = Accessor.Type.GETTER)
	public Collection<AddressModel> getAddresses()
	{
		if (this._addresses!=null)
		{
			return _addresses;
		}
		return _addresses = getPersistenceContext().getValue(ADDRESSES, _addresses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allWriteableCatalogVersions
	 */
	@Accessor(qualifier = "allWriteableCatalogVersions", type = Accessor.Type.GETTER)
	public Collection<CatalogVersionModel> getAllWriteableCatalogVersions()
	{
		if (this._allWriteableCatalogVersions!=null)
		{
			return _allWriteableCatalogVersions;
		}
		return _allWriteableCatalogVersions = getPersistenceContext().getValue(ALLWRITEABLECATALOGVERSIONS, _allWriteableCatalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the assignedComments
	 */
	@Accessor(qualifier = "assignedComments", type = Accessor.Type.GETTER)
	public List<CommentModel> getAssignedComments()
	{
		if (this._assignedComments!=null)
		{
			return _assignedComments;
		}
		return _assignedComments = getPersistenceContext().getValue(ASSIGNEDCOMMENTS, _assignedComments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.carts</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the carts
	 */
	@Accessor(qualifier = "carts", type = Accessor.Type.GETTER)
	public Collection<CartModel> getCarts()
	{
		if (this._carts!=null)
		{
			return _carts;
		}
		return _carts = getPersistenceContext().getValue(CARTS, _carts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.contactInfos</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the contactInfos
	 */
	@Accessor(qualifier = "contactInfos", type = Accessor.Type.GETTER)
	public Collection<AbstractContactInfoModel> getContactInfos()
	{
		if (this._contactInfos!=null)
		{
			return _contactInfos;
		}
		return _contactInfos = getPersistenceContext().getValue(CONTACTINFOS, _contactInfos);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.createdComments</code> attribute defined at extension <code>comments</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the createdComments
	 */
	@Accessor(qualifier = "createdComments", type = Accessor.Type.GETTER)
	public List<AbstractCommentModel> getCreatedComments()
	{
		if (this._createdComments!=null)
		{
			return _createdComments;
		}
		return _createdComments = getPersistenceContext().getValue(CREATEDCOMMENTS, _createdComments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.currentDate</code> attribute defined at extension <code>core</code>. 
	 * @return the currentDate
	 */
	@Accessor(qualifier = "currentDate", type = Accessor.Type.GETTER)
	public Date getCurrentDate()
	{
		if (this._currentDate!=null)
		{
			return _currentDate;
		}
		return _currentDate = getPersistenceContext().getValue(CURRENTDATE, _currentDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.currentTime</code> attribute defined at extension <code>core</code>. 
	 * @return the currentTime
	 */
	@Accessor(qualifier = "currentTime", type = Accessor.Type.GETTER)
	public Date getCurrentTime()
	{
		if (this._currentTime!=null)
		{
			return _currentTime;
		}
		return _currentTime = getPersistenceContext().getValue(CURRENTTIME, _currentTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. 
	 * @return the defaultPaymentAddress
	 */
	@Accessor(qualifier = "defaultPaymentAddress", type = Accessor.Type.GETTER)
	public AddressModel getDefaultPaymentAddress()
	{
		if (this._defaultPaymentAddress!=null)
		{
			return _defaultPaymentAddress;
		}
		return _defaultPaymentAddress = getPersistenceContext().getValue(DEFAULTPAYMENTADDRESS, _defaultPaymentAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. 
	 * @return the defaultShipmentAddress
	 */
	@Accessor(qualifier = "defaultShipmentAddress", type = Accessor.Type.GETTER)
	public AddressModel getDefaultShipmentAddress()
	{
		if (this._defaultShipmentAddress!=null)
		{
			return _defaultShipmentAddress;
		}
		return _defaultShipmentAddress = getPersistenceContext().getValue(DEFAULTSHIPMENTADDRESS, _defaultShipmentAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. 
	 * @return the encodedPassword
	 */
	@Accessor(qualifier = "encodedPassword", type = Accessor.Type.GETTER)
	public String getEncodedPassword()
	{
		if (this._encodedPassword!=null)
		{
			return _encodedPassword;
		}
		return _encodedPassword = getPersistenceContext().getValue(ENCODEDPASSWORD, _encodedPassword);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the europe1Discounts
	 */
	@Accessor(qualifier = "europe1Discounts", type = Accessor.Type.GETTER)
	public Collection<GlobalDiscountRowModel> getEurope1Discounts()
	{
		if (this._europe1Discounts!=null)
		{
			return _europe1Discounts;
		}
		return _europe1Discounts = getPersistenceContext().getValue(EUROPE1DISCOUNTS, _europe1Discounts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_UDG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_UDG", type = Accessor.Type.GETTER)
	public UserDiscountGroup getEurope1PriceFactory_UDG()
	{
		if (this._Europe1PriceFactory_UDG!=null)
		{
			return _Europe1PriceFactory_UDG;
		}
		return _Europe1PriceFactory_UDG = getPersistenceContext().getValue(EUROPE1PRICEFACTORY_UDG, _Europe1PriceFactory_UDG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_UPG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_UPG", type = Accessor.Type.GETTER)
	public UserPriceGroup getEurope1PriceFactory_UPG()
	{
		if (this._Europe1PriceFactory_UPG!=null)
		{
			return _Europe1PriceFactory_UPG;
		}
		return _Europe1PriceFactory_UPG = getPersistenceContext().getValue(EUROPE1PRICEFACTORY_UPG, _Europe1PriceFactory_UPG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_UTG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_UTG", type = Accessor.Type.GETTER)
	public UserTaxGroup getEurope1PriceFactory_UTG()
	{
		if (this._Europe1PriceFactory_UTG!=null)
		{
			return _Europe1PriceFactory_UTG;
		}
		return _Europe1PriceFactory_UTG = getPersistenceContext().getValue(EUROPE1PRICEFACTORY_UTG, _Europe1PriceFactory_UTG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. 
	 * @return the hmcLoginDisabled
	 */
	@Accessor(qualifier = "hmcLoginDisabled", type = Accessor.Type.GETTER)
	public Boolean getHmcLoginDisabled()
	{
		if (this._hmcLoginDisabled!=null)
		{
			return _hmcLoginDisabled;
		}
		return _hmcLoginDisabled = getPersistenceContext().getValue(HMCLOGINDISABLED, _hmcLoginDisabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.lastLogin</code> attribute defined at extension <code>core</code>. 
	 * @return the lastLogin
	 */
	@Accessor(qualifier = "lastLogin", type = Accessor.Type.GETTER)
	public Date getLastLogin()
	{
		if (this._lastLogin!=null)
		{
			return _lastLogin;
		}
		return _lastLogin = getPersistenceContext().getValue(LASTLOGIN, _lastLogin);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.orders</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orders
	 */
	@Accessor(qualifier = "orders", type = Accessor.Type.GETTER)
	public Collection<OrderModel> getOrders()
	{
		if (this._orders!=null)
		{
			return _orders;
		}
		return _orders = getPersistenceContext().getValue(ORDERS, _orders);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. 
	 * @return the passwordAnswer
	 */
	@Accessor(qualifier = "passwordAnswer", type = Accessor.Type.GETTER)
	public String getPasswordAnswer()
	{
		if (this._passwordAnswer!=null)
		{
			return _passwordAnswer;
		}
		return _passwordAnswer = getPersistenceContext().getValue(PASSWORDANSWER, _passwordAnswer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. 
	 * @return the passwordEncoding
	 */
	@Accessor(qualifier = "passwordEncoding", type = Accessor.Type.GETTER)
	public String getPasswordEncoding()
	{
		if (this._passwordEncoding!=null)
		{
			return _passwordEncoding;
		}
		return _passwordEncoding = getPersistenceContext().getValue(PASSWORDENCODING, _passwordEncoding);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. 
	 * @return the passwordQuestion
	 */
	@Accessor(qualifier = "passwordQuestion", type = Accessor.Type.GETTER)
	public String getPasswordQuestion()
	{
		if (this._passwordQuestion!=null)
		{
			return _passwordQuestion;
		}
		return _passwordQuestion = getPersistenceContext().getValue(PASSWORDQUESTION, _passwordQuestion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the paymentInfos
	 */
	@Accessor(qualifier = "paymentInfos", type = Accessor.Type.GETTER)
	public Collection<PaymentInfoModel> getPaymentInfos()
	{
		if (this._paymentInfos!=null)
		{
			return _paymentInfos;
		}
		return _paymentInfos = getPersistenceContext().getValue(PAYMENTINFOS, _paymentInfos);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. 
	 * @return the sessionCurrency
	 */
	@Accessor(qualifier = "sessionCurrency", type = Accessor.Type.GETTER)
	public CurrencyModel getSessionCurrency()
	{
		if (this._sessionCurrency!=null)
		{
			return _sessionCurrency;
		}
		return _sessionCurrency = getPersistenceContext().getValue(SESSIONCURRENCY, _sessionCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. 
	 * @return the sessionLanguage
	 */
	@Accessor(qualifier = "sessionLanguage", type = Accessor.Type.GETTER)
	public LanguageModel getSessionLanguage()
	{
		if (this._sessionLanguage!=null)
		{
			return _sessionLanguage;
		}
		return _sessionLanguage = getPersistenceContext().getValue(SESSIONLANGUAGE, _sessionLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.userprofile</code> attribute defined at extension <code>core</code>. 
	 * @return the userprofile
	 */
	@Accessor(qualifier = "userprofile", type = Accessor.Type.GETTER)
	public UserProfileModel getUserprofile()
	{
		if (this._userprofile!=null)
		{
			return _userprofile;
		}
		return _userprofile = getPersistenceContext().getValue(USERPROFILE, _userprofile);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. 
	 * @return the loginDisabled - Determines whether user is allowed to login to system.
	 */
	@Accessor(qualifier = "loginDisabled", type = Accessor.Type.GETTER)
	public boolean isLoginDisabled()
	{
		return toPrimitive( _loginDisabled = getPersistenceContext().getValue(LOGINDISABLED, _loginDisabled));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.addresses</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the addresses
	 */
	@Accessor(qualifier = "addresses", type = Accessor.Type.SETTER)
	public void setAddresses(final Collection<AddressModel> value)
	{
		_addresses = getPersistenceContext().setValue(ADDRESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the assignedComments
	 */
	@Accessor(qualifier = "assignedComments", type = Accessor.Type.SETTER)
	public void setAssignedComments(final List<CommentModel> value)
	{
		_assignedComments = getPersistenceContext().setValue(ASSIGNEDCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.carts</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the carts
	 */
	@Accessor(qualifier = "carts", type = Accessor.Type.SETTER)
	public void setCarts(final Collection<CartModel> value)
	{
		_carts = getPersistenceContext().setValue(CARTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.contactInfos</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the contactInfos
	 */
	@Accessor(qualifier = "contactInfos", type = Accessor.Type.SETTER)
	public void setContactInfos(final Collection<AbstractContactInfoModel> value)
	{
		_contactInfos = getPersistenceContext().setValue(CONTACTINFOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.createdComments</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the createdComments
	 */
	@Accessor(qualifier = "createdComments", type = Accessor.Type.SETTER)
	public void setCreatedComments(final List<AbstractCommentModel> value)
	{
		_createdComments = getPersistenceContext().setValue(CREATEDCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the defaultPaymentAddress
	 */
	@Accessor(qualifier = "defaultPaymentAddress", type = Accessor.Type.SETTER)
	public void setDefaultPaymentAddress(final AddressModel value)
	{
		_defaultPaymentAddress = getPersistenceContext().setValue(DEFAULTPAYMENTADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the defaultShipmentAddress
	 */
	@Accessor(qualifier = "defaultShipmentAddress", type = Accessor.Type.SETTER)
	public void setDefaultShipmentAddress(final AddressModel value)
	{
		_defaultShipmentAddress = getPersistenceContext().setValue(DEFAULTSHIPMENTADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the encodedPassword
	 */
	@Accessor(qualifier = "encodedPassword", type = Accessor.Type.SETTER)
	public void setEncodedPassword(final String value)
	{
		_encodedPassword = getPersistenceContext().setValue(ENCODEDPASSWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the europe1Discounts
	 */
	@Accessor(qualifier = "europe1Discounts", type = Accessor.Type.SETTER)
	public void setEurope1Discounts(final Collection<GlobalDiscountRowModel> value)
	{
		_europe1Discounts = getPersistenceContext().setValue(EUROPE1DISCOUNTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_UDG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_UDG", type = Accessor.Type.SETTER)
	public void setEurope1PriceFactory_UDG(final UserDiscountGroup value)
	{
		_Europe1PriceFactory_UDG = getPersistenceContext().setValue(EUROPE1PRICEFACTORY_UDG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_UPG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_UPG", type = Accessor.Type.SETTER)
	public void setEurope1PriceFactory_UPG(final UserPriceGroup value)
	{
		_Europe1PriceFactory_UPG = getPersistenceContext().setValue(EUROPE1PRICEFACTORY_UPG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_UTG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_UTG", type = Accessor.Type.SETTER)
	public void setEurope1PriceFactory_UTG(final UserTaxGroup value)
	{
		_Europe1PriceFactory_UTG = getPersistenceContext().setValue(EUROPE1PRICEFACTORY_UTG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the hmcLoginDisabled
	 */
	@Accessor(qualifier = "hmcLoginDisabled", type = Accessor.Type.SETTER)
	public void setHmcLoginDisabled(final Boolean value)
	{
		_hmcLoginDisabled = getPersistenceContext().setValue(HMCLOGINDISABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.lastLogin</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the lastLogin
	 */
	@Accessor(qualifier = "lastLogin", type = Accessor.Type.SETTER)
	public void setLastLogin(final Date value)
	{
		_lastLogin = getPersistenceContext().setValue(LASTLOGIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the loginDisabled - Determines whether user is allowed to login to system.
	 */
	@Accessor(qualifier = "loginDisabled", type = Accessor.Type.SETTER)
	public void setLoginDisabled(final boolean value)
	{
		_loginDisabled = getPersistenceContext().setValue(LOGINDISABLED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.orders</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the orders
	 */
	@Accessor(qualifier = "orders", type = Accessor.Type.SETTER)
	public void setOrders(final Collection<OrderModel> value)
	{
		_orders = getPersistenceContext().setValue(ORDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the passwordAnswer
	 */
	@Accessor(qualifier = "passwordAnswer", type = Accessor.Type.SETTER)
	public void setPasswordAnswer(final String value)
	{
		_passwordAnswer = getPersistenceContext().setValue(PASSWORDANSWER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the passwordEncoding
	 */
	@Accessor(qualifier = "passwordEncoding", type = Accessor.Type.SETTER)
	public void setPasswordEncoding(final String value)
	{
		_passwordEncoding = getPersistenceContext().setValue(PASSWORDENCODING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the passwordQuestion
	 */
	@Accessor(qualifier = "passwordQuestion", type = Accessor.Type.SETTER)
	public void setPasswordQuestion(final String value)
	{
		_passwordQuestion = getPersistenceContext().setValue(PASSWORDQUESTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentInfos
	 */
	@Accessor(qualifier = "paymentInfos", type = Accessor.Type.SETTER)
	public void setPaymentInfos(final Collection<PaymentInfoModel> value)
	{
		_paymentInfos = getPersistenceContext().setValue(PAYMENTINFOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the sessionCurrency
	 */
	@Accessor(qualifier = "sessionCurrency", type = Accessor.Type.SETTER)
	public void setSessionCurrency(final CurrencyModel value)
	{
		_sessionCurrency = getPersistenceContext().setValue(SESSIONCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the sessionLanguage
	 */
	@Accessor(qualifier = "sessionLanguage", type = Accessor.Type.SETTER)
	public void setSessionLanguage(final LanguageModel value)
	{
		_sessionLanguage = getPersistenceContext().setValue(SESSIONLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.userprofile</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the userprofile
	 */
	@Accessor(qualifier = "userprofile", type = Accessor.Type.SETTER)
	public void setUserprofile(final UserProfileModel value)
	{
		_userprofile = getPersistenceContext().setValue(USERPROFILE, value);
	}
	
}
