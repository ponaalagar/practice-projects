function generateTable() {
    const periods = document.getElementById('periods').value;
    const days = document.getElementById('days').value;
    const timetable = document.getElementById('timetable');
    const subjectInputs = document.getElementById('subject-inputs');
  
    // Clear any existing table and subject inputs
    timetable.innerHTML = "";
    subjectInputs.innerHTML = "";
  
    // Create subject input fields
    let subjectInputHtml = "";
    for (let i = 1; i <= periods; i++) {
      subjectInputHtml += `<label for="subject-${i}">Period ${i} Subject:</label>`;
      subjectInputHtml += `<input type="text" id="subject-${i}" required><br>`;
    }
    subjectInputs.innerHTML = subjectInputHtml;
  
    // Create table element
    const table = document.createElement('table');
  
    // Create table header row for days
    const headerRow = document.createElement('tr');
    headerRow.appendChild(document.createElement('th')); // Empty cell for period labels
    for (let i = 1; i <= days; i++) {
      const dayHeader = document.createElement('th');
      dayHeader.textContent = `Day ${i}`;
      headerRow.appendChild(dayHeader);
    }
    table.appendChild(headerRow);
  
    // Create table body rows for periods
    for (let i = 1; i <= periods; i++) {
      const row = document.createElement('tr');
      const periodHeader = document.createElement('th');
      periodHeader.textContent = `Period ${i}`;
      row.appendChild(periodHeader);
  
      // Add cells with subject names from input fields
      for (let j = 1; j <= days; j++) {
        const cell = document.createElement('td');
        const subjectInput = document.getElementById(`subject-${i}`);
        cell.textContent = subjectInput.value;
        row.appendChild(cell);
      }
      table.appendChild(row);
    }
  
    timetable.appendChild(table);
  }
  