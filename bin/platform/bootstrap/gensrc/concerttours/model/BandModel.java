/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2018/1/7 下午 03:03:30                        ---
 * ----------------------------------------------------------------
 */
package concerttours.model;

import concerttours.enums.MusicType;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Set;

/**
 * Generated model class for type Band first defined at extension concerttours.
 */
@SuppressWarnings("all")
public class BandModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Band";
	
	/**<i>Generated relation code constant for relation <code>Product2RockBand</code> defining source attribute <code>tours</code> in extension <code>concerttours</code>.</i>*/
	public final static String _PRODUCT2ROCKBAND = "Product2RockBand";
	
	/** <i>Generated constant</i> - Attribute key of <code>Band.code</code> attribute defined at extension <code>concerttours</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Band.name</code> attribute defined at extension <code>concerttours</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Band.history</code> attribute defined at extension <code>concerttours</code>. */
	public static final String HISTORY = "history";
	
	/** <i>Generated constant</i> - Attribute key of <code>Band.albumSales</code> attribute defined at extension <code>concerttours</code>. */
	public static final String ALBUMSALES = "albumSales";
	
	/** <i>Generated constant</i> - Attribute key of <code>Band.tours</code> attribute defined at extension <code>concerttours</code>. */
	public static final String TOURS = "tours";
	
	/** <i>Generated constant</i> - Attribute key of <code>Band.types</code> attribute defined at extension <code>concerttours</code>. */
	public static final String TYPES = "types";
	
	
	/** <i>Generated variable</i> - Variable of <code>Band.code</code> attribute defined at extension <code>concerttours</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Band.name</code> attribute defined at extension <code>concerttours</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>Band.history</code> attribute defined at extension <code>concerttours</code>. */
	private String _history;
	
	/** <i>Generated variable</i> - Variable of <code>Band.albumSales</code> attribute defined at extension <code>concerttours</code>. */
	private Long _albumSales;
	
	/** <i>Generated variable</i> - Variable of <code>Band.tours</code> attribute defined at extension <code>concerttours</code>. */
	private Set<ProductModel> _tours;
	
	/** <i>Generated variable</i> - Variable of <code>Band.types</code> attribute defined at extension <code>concerttours</code>. */
	private Collection<MusicType> _types;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BandModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.albumSales</code> attribute defined at extension <code>concerttours</code>. 
	 * @return the albumSales - official global album sales
	 */
	@Accessor(qualifier = "albumSales", type = Accessor.Type.GETTER)
	public Long getAlbumSales()
	{
		if (this._albumSales!=null)
		{
			return _albumSales;
		}
		return _albumSales = getPersistenceContext().getValue(ALBUMSALES, _albumSales);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.code</code> attribute defined at extension <code>concerttours</code>. 
	 * @return the code - short unique code of band
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.history</code> attribute defined at extension <code>concerttours</code>. 
	 * @return the history - history of band
	 */
	@Accessor(qualifier = "history", type = Accessor.Type.GETTER)
	public String getHistory()
	{
		if (this._history!=null)
		{
			return _history;
		}
		return _history = getPersistenceContext().getValue(HISTORY, _history);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.name</code> attribute defined at extension <code>concerttours</code>. 
	 * @return the name - name of band
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
	 * <i>Generated method</i> - Getter of the <code>Band.tours</code> attribute defined at extension <code>concerttours</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the tours
	 */
	@Accessor(qualifier = "tours", type = Accessor.Type.GETTER)
	public Set<ProductModel> getTours()
	{
		if (this._tours!=null)
		{
			return _tours;
		}
		return _tours = getPersistenceContext().getValue(TOURS, _tours);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Band.types</code> attribute defined at extension <code>concerttours</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the types
	 */
	@Accessor(qualifier = "types", type = Accessor.Type.GETTER)
	public Collection<MusicType> getTypes()
	{
		if (this._types!=null)
		{
			return _types;
		}
		return _types = getPersistenceContext().getValue(TYPES, _types);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Band.albumSales</code> attribute defined at extension <code>concerttours</code>. 
	 *  
	 * @param value the albumSales - official global album sales
	 */
	@Accessor(qualifier = "albumSales", type = Accessor.Type.SETTER)
	public void setAlbumSales(final Long value)
	{
		_albumSales = getPersistenceContext().setValue(ALBUMSALES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Band.code</code> attribute defined at extension <code>concerttours</code>. 
	 *  
	 * @param value the code - short unique code of band
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Band.history</code> attribute defined at extension <code>concerttours</code>. 
	 *  
	 * @param value the history - history of band
	 */
	@Accessor(qualifier = "history", type = Accessor.Type.SETTER)
	public void setHistory(final String value)
	{
		_history = getPersistenceContext().setValue(HISTORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Band.name</code> attribute defined at extension <code>concerttours</code>. 
	 *  
	 * @param value the name - name of band
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Band.tours</code> attribute defined at extension <code>concerttours</code>. 
	 *  
	 * @param value the tours
	 */
	@Accessor(qualifier = "tours", type = Accessor.Type.SETTER)
	public void setTours(final Set<ProductModel> value)
	{
		_tours = getPersistenceContext().setValue(TOURS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Band.types</code> attribute defined at extension <code>concerttours</code>. 
	 *  
	 * @param value the types
	 */
	@Accessor(qualifier = "types", type = Accessor.Type.SETTER)
	public void setTypes(final Collection<MusicType> value)
	{
		_types = getPersistenceContext().setValue(TYPES, value);
	}
	
}
