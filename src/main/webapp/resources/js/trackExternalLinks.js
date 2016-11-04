window.addEventListener('load', function () {
  Array.prototype.filter.call(
    document.querySelectorAll('a[href^="http"]:not(.dont-track)'),
    function(element) {
      var ccb = element.href.indexOf("casadocodigo.com.br");
      if (ccb == -1) {
        ccb = element.href.indexOf("localhost");
      }
      return ccb != 7 && ccb != 11;
    }
  ).forEach(function(link) {
    link.addEventListener("click", function(e) {
      ga('send', 'pageview', '/LinkExterno/' + this.href);
    });
  });
});
