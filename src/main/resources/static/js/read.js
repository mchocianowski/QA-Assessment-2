`use strict`;

// import the dom
import * as DOM from "./dom.js";

// list item function
const writeVItem = (vitem) => {
  const listbody = document.createElement(`div`);
  const brand = document.createElement(`li`);
  const model = document.createElement(`li`);
  const price = document.createElement(`li`);
  const mileage = document.createElement(`li`);
  listbody.id = vitem._id;

  brand.innerHTML = `Brand: ${vitem.brand}`
  model.innerHTML = `Model: ${vitem.model}`
  price.innerHTML = `Price: ${vitem.price}`
  model.innerHTML = `Mileage: ${vitem.mileage}`
  listbody.appendChild(brand);
  listbody.appendChild(model);
  listbody.appendChild(price);
  listbody.appendChild(mileage);
  DOM.listOutput.appendChild(listbody);
};

// GET all function
const get = () => {
  console.log(DOM.listOutput);
  DOM.listOutput.innerHTML = ``;

  axios
    .get(`http://localhost:8080/getAll`)
    .then((response) => {
      if (!Array.isArray(response.data)) {
        writeVItem(response.data);
      } else {
        for (let vitem of response.data) {
          console.log(vitem);
          writeVItem(vitem);
        }
      }
    })
    .catch((err) => {
      console.log(err);
    });
};

// GET By Id function
const getById = () => {
  let id = DOM.readId.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost:8080/get/${id}`)
    .then((response) => {
      output.innerHTML = ` `;
        writeVItem(response.data);
    })
    .catch((err) => {
      console.log(err);
    });
};

// GET By Brand function
const getByBrand = () => {
  let brand = DOM.readBrand.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost:8080/getByBrand/${brand}`)
    .then((response) => {
      output.innerHTML = ` `;
      for (let vitem of response.data) {
        writeVItem(vitem);
      }
    })
    .catch((err) => {
      console.log(err);
    });
};

// GET By Price function
const getByPrice = () => {
  let price = DOM.readPrice.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost:8080/getByPrice/${price}`)
    .then((response) => {
      output.innerHTML = ` `;
      for (let vitem of response.data) {
        writeVItem(vitem);
      }
    })
    .catch((err) => {
      console.log(err);
    });
};

// GET By Mileage function
const getByMileage = () => {
  let mileage = DOM.readMileage.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost:8080/getByMileage/${mileage}`)
    .then((response) => {
      output.innerHTML = ` `;
      for (let vitem of response.data) {
        writeVItem(vitem);
      }
    })
    .catch((err) => {
      console.log(err);
    });
};

// set up the buttons' on click events
DOM.buttonViewAll.onclick = () => get();
DOM.buttonReadById.onclick = () => getById();
DOM.buttonReadByBrand.onclick = () => getByBrand();
DOM.buttonReadByPrice.onclick = () => getByPrice();
DOM.buttonReadByMileage.onclick = () => getByMileage();
