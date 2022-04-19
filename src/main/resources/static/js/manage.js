`use strict`;

// import the dom
import * as DOM from "./dom.js";

// POST function
const post = () => {
  axios
    .post(`http://localhost8080/create/`, {
      brand: DOM.inputBrand.value,
      model: DOM.inputModel.value,
      price: DOM.inputPrice.value,
      mileage: DOM.inputMileage.value,
    })
    .then((response) => {
      console.log(response);
    })
    .catch((err) => {
      console.log(err);
    });
};

// UPDATE function
const update = () => {
  let id = DOM.updateId.value;
  axios
    .put(`http://localhost8080/replace/` + id, {
      brand: DOM.updateBrand.value,
      model: DOM.updateModel.value,
      price: DOM.updatePrice.value,
      mileage: DOM.inputMileage.value,
    })
    .then((response) => {
      console.log(response);
      get();
    })
    .catch((err) => {
      console.log(err);
    });
};

// Delete Function
const deleteById = () => {
  let id = DOM.deleteId.value;
  axios
    .delete(`http://localhost8080/remove/` + id, { id: DOM.deleteId.value })
    .then((response) => {
      console.log(response);
      get();
    })
    .catch((err) => {
      console.log(err);
    });
};
