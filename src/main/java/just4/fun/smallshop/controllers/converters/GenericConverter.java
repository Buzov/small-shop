package just4.fun.smallshop.controllers.converters;

public interface GenericConverter<Model, Form> {

    Model formToModel(Form form);

    Form modelToForm(Model model);

}
