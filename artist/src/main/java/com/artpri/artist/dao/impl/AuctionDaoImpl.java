/**
 *
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.AuctionDao;
import com.artpri.artist.model.ArtistAuction;
import com.artpri.artist.model.ArtistBook;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author 王校兵
 * @version 1.0, 2017年2月21日
 */
@Transactional
public class AuctionDaoImpl extends HibernateDaoImpl<ArtistAuction> implements AuctionDao {

    /* (non-Javadoc)
     * @see com.artpri.artist.dao.AuctionDao#addAuction(com.artpri.artist.model.ArtistAuction)
     */
    @Override
    public int addAuction(ArtistAuction art) {
        return (Integer) save(art);
    }

    /* (non-Javadoc)
     * @see com.artpri.artist.dao.AuctionDao#getAuction(int, int)
     */
    @Override
    public List getAuction(int pageNow, int pageSize) {
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        return findByPage("from ArtistAuction where userNum =" + userNum, pageNow, pageSize);
    }

    /* (non-Javadoc)
     * @see com.artpri.artist.dao.AuctionDao#delAuction(int)
     */
    @Override
    public void delAuction(int id) {
        delete(ArtistAuction.class, id);

    }

    /* (non-Javadoc)
     * @see com.artpri.artist.dao.AuctionDao#getAuction(int)
     */
    @Override
    public ArtistAuction getAuction(int id) {
        return (ArtistAuction) get(ArtistAuction.class, id);
    }

    /* (non-Javadoc)
     * @see com.artpri.artist.dao.AuctionDao#updateAuction(com.artpri.artist.model.ArtistAuction)
     */
    @Override
    public void updateAuction(ArtistAuction artistAuction) {
        update(artistAuction);
    }

}
