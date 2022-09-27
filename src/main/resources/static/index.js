/*****************************************音乐播放器处理*****************************************/
let canvas = $('#canvas');
canvas.click
(
    function()
    {
        var audio = document.getElementById("media");
        audio.play();
    }
)
let audio = document.getElementById("media");
audio.src = getMusicFilePath();
audio.addEventListener('ended', playEndedHandler, false);
/*****************************************音乐播放器处理_*****************************************/


/**
 * 播放器播放完后的事件
 */
function playEndedHandler()
{
    audio.src = getMusicFilePath();
    audio.play();
}

/**
 * 获取随机的歌曲路径
 */
function getMusicFilePath()
{
    let countStr = randomNum(1, 20) + '';
    let filePath = "./music/" + countStr.padStart(3, '0') + ".mp3"

    return filePath;
}

/**
 * 获取 [minNum,maxNum] 随机数.
 * @param minNum minNum
 * @param maxNum maxNum
 * @returns 随机数
 */
function randomNum(minNum, maxNum)
{
    switch(arguments.length)
    {
        case 1:
            return parseInt(Math.random()*minNum+1,10);
        case 2:
            return parseInt(Math.random()*(maxNum-minNum+1)+minNum,10);
        default:
            return 0;
    }
}