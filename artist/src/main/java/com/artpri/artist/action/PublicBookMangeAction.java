/**
 *
 */
package com.artpri.artist.action;

import java.io.File;

import com.opensymphony.xwork2.Action;

/**
 * 出版著作管理类action包括图书的上传，图书的修改，删除
 *
 * @author 王校兵
 * @version 1.0, 2016年4月11日
 */
public class PublicBookMangeAction extends BaseAction {

    private String book_sm;// 书名
    private File book_tp;// 书籍图片
    private String book_tpFileName;// 图片文件名称
    private String book_tpContentType;// 图片文件类型
    private String book_cbs;// 出版社
    private String book_zz;// 作者
    private String book_bz;// 编著
    private String book_date;// 出版日期
    private String book_kb;// 开本
    private String book_yc;// 印次
    private String book_lb;// 所属类别
    private String book_dj;// 定价
    private String book_isbn;// ISBN
    private String book_zy;// 内容提要
    private String book_mu;// 目录
    private String message;// 返回信息
    private int iid;// 书籍的id
    private int delState;// 删除书籍方法执行的返回状态信息

    /**
     * 上传出版图书的信息跳转处理类
     */
    public String uploadPublicBook() {
        String state = getPublicBookMangeService().uploadPublicBook(book_sm,
                book_tp, book_tpFileName, book_tpContentType, book_cbs,
                book_zz, book_bz, book_date, book_kb, book_yc, book_lb,
                book_dj, book_isbn, book_zy, book_mu);

        if (state.equals("success")) {
            message = "上传成功";
        } else {
            message = "上传失败，请重新尝试";
        }
        return Action.SUCCESS;
    }

    public String delPublicBook() {
        getPublicBookMangeService().delPublicBook(iid);
        delState = 1;
        return Action.SUCCESS;
    }

    public String updatePublicBook() {

        getPublicBookMangeService().updatePublicBook(iid, book_sm, book_tp,
                book_tpFileName, book_tpContentType, book_cbs, book_zz,
                book_bz, book_date, book_kb, book_yc, book_lb, book_dj,
                book_isbn, book_zy, book_mu);

        return Action.SUCCESS;
    }

    public String getBook_bz() {
        return book_bz;
    }

    public String getBook_cbs() {
        return book_cbs;
    }

    public String getBook_date() {
        return book_date;
    }

    public String getBook_dj() {
        return book_dj;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public String getBook_kb() {
        return book_kb;
    }

    public String getBook_lb() {
        return book_lb;
    }

    public String getBook_mu() {
        return book_mu;
    }

    public String getBook_sm() {
        return book_sm;
    }

    public File getBook_tp() {
        return book_tp;
    }

    public String getBook_tpContentType() {
        return book_tpContentType;
    }

    public String getBook_tpFileName() {
        return book_tpFileName;
    }

    public String getBook_yc() {
        return book_yc;
    }

    public String getBook_zy() {
        return book_zy;
    }

    public String getBook_zz() {
        return book_zz;
    }

    public int getDelState() {
        return delState;
    }

    public String getMessage() {
        return message;
    }

    public void setBook_bz(String book_bz) {
        this.book_bz = book_bz;
    }

    public void setBook_cbs(String book_cbs) {
        this.book_cbs = book_cbs;
    }

    public void setBook_date(String book_date) {
        this.book_date = book_date;
    }

    public void setBook_dj(String book_dj) {
        this.book_dj = book_dj;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public void setBook_kb(String book_kb) {
        this.book_kb = book_kb;
    }

    public void setBook_lb(String book_lb) {
        this.book_lb = book_lb;
    }

    public void setBook_mu(String book_mu) {
        this.book_mu = book_mu;
    }

    public void setBook_sm(String book_sm) {
        this.book_sm = book_sm;
    }

    public void setBook_tp(File book_tp) {
        this.book_tp = book_tp;
    }

    public void setBook_tpContentType(String book_tpContentType) {
        this.book_tpContentType = book_tpContentType;
    }

    public void setBook_tpFileName(String book_tpFileName) {
        this.book_tpFileName = book_tpFileName;
    }

    public void setBook_yc(String book_yc) {
        this.book_yc = book_yc;
    }

    public void setBook_zy(String book_zy) {
        this.book_zy = book_zy;
    }

    public void setBook_zz(String book_zz) {
        this.book_zz = book_zz;
    }

    public void setDelState(int delState) {
        this.delState = delState;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
