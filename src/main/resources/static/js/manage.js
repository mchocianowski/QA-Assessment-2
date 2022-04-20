`use strict`;

// import the dom
import * as DOM from "./dom.js";

// POST function
const post = () => {
  axios.post(`http://localhost:8080/create/`, {
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
  axios.put(`http://localhost:8080/replace/` + id, {
      brand: DOM.updateBrand.value,
      model: DOM.updateModel.value,
      price: DOM.updatePrice.value,
      mileage: DOM.updateMileage.value,
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
    .delete(`http://localhost:8080/remove/` + id, { id: DOM.deleteId.value })
    .then((response) => {
      console.log(response);
      get();
    })
    .catch((err) => {
      console.log(err);
    });
};

// set up the buttons' on click events
DOM.buttonCreate.onclick = () => post();
DOM.buttonUpdate.onclick = () => update();
DOM.buttonDelete.onclick = () => deleteById();