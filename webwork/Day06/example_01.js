document.addEventListener('DOMContentLoaded', function() {
    let nameHere = document.querySelector('#nameHere');
    let nameEditButton = document.querySelector('#nameEditButton');
    let editNameField = document.querySelector('#editNameField');
    let newNameInput = document.querySelector('#newname');
    let okButton = document.querySelector('#okButton');

    // 수정 버튼 클릭 시 이름 수정 필드 표시
    nameEditButton.addEventListener('click', function() {
        editNameField.style.display = 'block';
        newNameInput.focus();
        nameEditButton.style.display = 'none';
    });

    // 확인 버튼 클릭 시 이름 업데이트 및 수정 필드 숨기기
    okButton.addEventListener('click', function() {
        let newName = newNameInput.value.trim();
        if (newName) {
            nameHere.textContent = newName;
        }
        editNameField.style.display = 'none';
        nameEditButton.style.display = 'inline';
    });

    // Enter 키를 눌러도 확인 버튼 클릭과 같은 효과를 주기
    newNameInput.addEventListener('keypress', function(event) {
        if (event.key === 'Enter') {
            okButton.click();
        }
    });
});