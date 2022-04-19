`use strict`;

// import the dom
import * as DOM from "./dom.js";

// list item function
const writeVItem = (vitem) => {
  const child = document.createElement(`li`);
  child.id = vitem._id;
  child.innerHTML = `${JSON.stringify(vitem)}`;
  DOM.listOutput.appendChild(child);
};

// GET all function
const get = () => {
  DOM.listOutput.innerHTML = ``;

  axios
    .get(`http://localhost8080/getAll`)
    .then((response) => {
      if (!Array.isArray(response.data)) {
        writeVItem(response.data);
      } else {
        for (let vitem of response.data) {
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
    .get(`http://localhost8080/readById/` + id)
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

// GET By Brand function
const getByBrand = () => {
  let brand = DOM.readBrand.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost8080/readByBrand/` + brand)
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
  let brand = DOM.readPrice.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost8080/readByPrice/` + price)
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
  let brand = DOM.readMileage.value;
  let output = DOM.listOutput;
  axios
    .get(`http://localhost8080/readByMileage/` + mileage)
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
DOM.buttonReadByBrand.onclick = () => getByPrice();
DOM.buttonReadByBrand.onclick = () => getByMileage();
DOM.buttonCreate.onclick = () => post();
DOM.buttonDelete.onclick = () => deleteById();
