function $(id) {
    return typeof id === 'string' ? document.getElementById(id) : id;
}

window.onload = tab;

function tab() {
    var index = 0;

    var lis = $('tab-notice-tit').getElementsByTagName('li');
    var divs = $('tab-notice-con').getElementsByTagName('div');
    for (var i = 0; i < lis.length; i++) {
        lis[i].id = i;
        lis[i].onclick = function () {
            changeOption(this.id);
        }
    }
    function changeOption(curIndex) {
        for (var j = 0; j < lis.length; j++) {
            lis[j].className = '';
            divs[j].style.display = 'none';
        }
        lis[curIndex].className = 'tab-select';
        divs[curIndex].style.display = 'block';
        index = curIndex;
    }
}