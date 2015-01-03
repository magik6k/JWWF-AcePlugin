var element = $('<div>').width(data.width).height(data.height).addClass('aceCointainer')
var editorElement = $('<div>').html(data.text).addClass('aceeditor')
element.html(editorElement)
var editor = ace.edit(editorElement.get(0));
editor.setTheme("__jwwf/ace/theme/monokai");
editor.getSession().setMode("__jwwf/ace/mode/javascript");

return {element: element, data: {editorElement: editorElement, editor: editor}}
